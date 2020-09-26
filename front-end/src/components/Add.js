import {MyFetch} from './MyFetch';

export function Add(params){
    let myfetch =MyFetch('/add','POST',JSON.stringify(params));
    return(myfetch)
    .then((res)=>{return res.json();})
    .then((res)=>{
        const accounts ={
            isFetching:false,
            result:res
        }
        return accounts
    })
}
