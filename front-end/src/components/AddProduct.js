import React, {Component} from 'react';
import '../style/AddProduct.css';


class AddProduct extends Component{
    state={
        name:'',
        price:'',
        unit:'',
        image:''
      }

      handleChange = (event) => {
        this.setState({
            [event.target.name]: event.target.value
        })
    }

        handleSubmit= ()=>{
            const url = "http://localhost:8080/addProduct";
            fetch(url, {
                method : 'POST',
                mode : 'cors',
                body : {
                    name:this.state.name,
                    price:this.state.price,
                    unit:this.state.unit,
                    image:this.state.image
                }
            })
        }

    render(){
        return(
          <form className = 'myform' onSubmit={this.handleSubmit}>
            <h1 id={'myh1'}>添加商品</h1>
            <label id={'mylabel'}>
                <p>*名称：</p>
                 <input id={'myinput'} type='text' name='name' placeholder='名称' onChange={this.handleChange} value={this.state.name}/>  
            </label>
            <label id={'mylabel'}>
                <p>*价格：</p>
                <input id={'myinput'} type='text' name='price' placeholder='价格'  onChange={this.handleChange} value={this.state.description}/>  
            </label>
            <label id={'mylabel'}>
                <p>*单位：</p>
                <input id={'myinput'} type='text' name='unit' placeholder='单位'  onChange={this.handleChange} value={this.state.description}/>  
            </label>
            <label id={'mylabel'}>
                <p>*图片：</p>
                <input id={'myinput'} type='text' name='image' placeholder='图片'  onChange={this.handleChange} value={this.state.description}/>  
            </label>
            <input 
             id={'mysubmit'} 
            type='submit' 
            value='提交'
            disabled={!this.state.name||!this.state.price||!this.state.unit||!this.state.image}/>
         </form>
        );
    }
}

export default AddProduct;