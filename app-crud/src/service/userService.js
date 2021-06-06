import axios from "axios";

export  default  class UserServices{
    url="http://localhost:5050/Home";
    getAll(){
        return axios.get(this.url+"/All");
    }
}