import React, {Component} from 'react';
import '../style/Store.css';

class Store extends Component{
    constructor(props){
        super(props);
        this.state={
            products:[
                {
                    name: '',
                    price:'',
                    unit:'',
                    image:''
                }
            ]
        }
    }

    componentDidMount() {
        fetch("http://localhost:8080/product", {
            method : 'GET'
        }).then(function(res){
            if(res.ok){
                res.json().then(function(data){
                    this.setState({
                        products: data
                    })
                })
            }
      })
    }

    showDetail = (data) =>{
        const detail = [];
        data.forEach((element,index) =>{
            detail.push(
                <div>
                    <img src={data[index].image} alt="load..." />
                    <p>{data[index].price}/{data[index].unit}</p>
                    <p>{data[index].name}</p>
                </div>
            )
        })
    }

    render(){
        return(
            <div>
                <div>
                    {this.showDetail(this.state.products)}
                </div>
            </div>
        );
    }
}

export default Store;