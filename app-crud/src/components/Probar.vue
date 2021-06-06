<template>
 <div>
   <div class="blog-item" v-for="imp in datos" v-bind:key="imp">
     {{imp}}
   </div>

 </div>
</template>

<script>
import axios from "axios";
export default {
  name: "Probar",
  data(){
    return{
      datos:[]
    }
  },
  mounted() {
    let vue=this;
    axios.get("http://localhost:5050/Home/21").
    then(function(response){
      vue.datos=response.data
      console.log(vue.datos)
    } )
  }
}
</script>

<style scoped>

</style>