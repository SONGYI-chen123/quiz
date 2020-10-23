import React, {Component} from 'react';
import '../style/Store.css';

class Store extends Component{
    constructor(props){
        super(props);
        this.state={
            products:[]
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


    render(){
        return(
            <div>
                <h1>product</h1>
            </div>
        );
    }
}

export default Store;