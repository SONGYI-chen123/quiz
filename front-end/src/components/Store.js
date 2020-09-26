import React, {Component} from 'react';
import '../style/Store.css';
import '../components/Add';

class Store extends Component{
    constructor(){
        super();
        this.state={
            products:[
                {name:'苹果',price:'10.00元每斤'},
                {name:'梨',price:'12.00元每斤'},
                {name:'可乐',price:'2.50元每听'},
                {name:'雪碧',price:'2.50元每听'},
                {name:'衬衫',price:'88元每件'},
            ]
        }
    }




    render(){
        return(
            <div id='store'>
                <ul className='mydiv'>
                    <li>
                        <img src='../img/1.jpg' alt='图片加载中...'></img>
                        <p id='myp'>{this.state.products[0].name}</p>
                        <p>{this.state.products[0].price}</p>
                        <button id='mybtn'onClick='Add(this.state.products[0])'>+</button>
                    </li>
                    <li>
                        <img src='../img/2.jpg' alt='图片加载中...'></img>
                        <p id='myp'>{this.state.products[1].name}</p>
                        <p>{this.state.products[1].price}</p>
                        <button id='mybtn'>+</button>
                    </li>
                    <li>
                        <img src='../img/3.jpg' alt='图片加载中...'></img>
                        <p id='myp'>{this.state.products[2].name}</p>
                        <p>{this.state.products[2].price}</p>
                        <button id='mybtn'>+</button>
                    </li>
                </ul>
                <ul className='mydiv'>
                    <li>
                        <img src='../img/4.jpg' alt='图片加载中...'></img>
                        <p id='myp'>{this.state.products[3].name}</p>
                        <p>{this.state.products[3].price}</p>
                        <button id='mybtn'>+</button>
                    </li>
                    <li>
                        <img src='../img/5.jpg' alt='图片加载中...'></img>
                        <p id='myp'>{this.state.products[4].name}</p>
                        <p>{this.state.products[4].price}</p>
                        <button id='mybtn'>+</button>
                    </li>
                </ul>
            </div>
            
        );
    }
}

export default Store;