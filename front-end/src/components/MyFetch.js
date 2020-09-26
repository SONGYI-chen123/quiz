const url='http://localhost:3000';

export const MyFetch = (newurl,method,body,contentType) =>{
    return fetch(url+newurl,{
        method: method,
        headers:{
            'Access-Control-Allow-Origin':'*',
            'Content-type': !contentType?'applocation/json':contentType
        },
        mode:'cors',
        body: body
    })
}