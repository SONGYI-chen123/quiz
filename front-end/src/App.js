import React, {Component} from 'react';
import {BrowserRouter,Link,Route} from 'react-router-dom';
import './App.css';
import Store from './components/Store';
import OrderForm from './components/OrderForm';
import AddProduct from './components/AddProduct';

class App extends Component {

  render() {
    return (
      <BrowserRouter>
      <div className="App">
        
        <ul>
        <li>
            <Link to='/' >商城</Link>
        </li>
          
        <li>
            <Link to='/order-form'>订单</Link>
        </li>
        <li>
             <Link to='/add-product'>+ 添加商品</Link>
        </li>
        </ul>

        <Route exact path='/' component={Store} />
        <Route path='/order-form' component={OrderForm} />
        <Route path='/add-product' component={AddProduct} />
      </div>
      </BrowserRouter>
    );
  }
}


export default App;
