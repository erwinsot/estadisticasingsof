<template>
  <div class="Data">
    <b-table striped hover :items="post"></b-table>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "DataUsers",
  data(){
    return{
      post:[],
    }
  },
  mounted() {
    let vue=this;
    axios.get("http://localhost:5050/Home/5").
    then(function(response){
      vue.post=response.data
     // console.log(vue.post)
    } )
  }
}
</script>

<style scoped>
.Data{margin-left: auto;
  margin-right: auto}
.Data{align-content: center}
.Data {width: 80%}


</style>