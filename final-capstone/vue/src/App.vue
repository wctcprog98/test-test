<template>
  <div id="app">

    <div class="DashBoard"> 
    <Header> </Header>
    <brewery-card> </brewery-card>
    <main-top> </main-top>
    <main-bottom> </main-bottom>





  </div>

    <div id="nav">
      <router-link v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|&nbsp;
      <router-link
        v-bind:to="{ name: 'logout' }"
        v-if="$store.state.token != ''"
        >Logout</router-link
      >
    </div>
    <router-view />
    <div>
      <p v-for="brewery in this.breweries" v-bind:key="brewery.id">
        {{ brewery.breweryName }}
      </p>
    </div>
  </div>
</template>

<script>
import BreweryService from "@/services/BreweryService";


import BreweryCard from "./components/BreweryCard.vue";
import MainTop from "./components/MainTop.vue";
import Header from "./components/Header.vue";
import MainBottom from "./components/MainBottom.vue";

export default {
  data() {
    return {
      breweries: {},
    };
  },
  created() {
    BreweryService.list().then((response) => {
      this.breweries = response.data;
    });
  },
  components: {BreweryCard ,MainTop, Header, MainBottom}
  
};
</script>

<style>
.DashBoard{
  box-sizing: border-box;
  padding: 25px;
  display: grid;
  grid-template-rows: 1fr 5fr 3fr ;
  grid-template-columns: 1fr 1fr; 
  grid-gap: 7%;
  grid-template-areas: 
  "Header Header Header"
  "BreweryCard MainTop Maintop"
  "BreweryCard MainBottom MainBottom"
  

  
  ;
}

.Header{
  grid-area: Header;
  background: goldenrod;
  height: 120%;
  border-radius: 10px;
  border: 6px solid  black;
  

}

.BreweryCard{
  grid-area: BreweryCard;
  background: goldenrod;
  border-radius: 10px;
  border: 6px solid black;
}

.MainTop{
  grid-area: MainTop;
  background: goldenrod;
  border-radius: 10px;
  border: 6px solid black;

}

.MainBottom{
  grid-area: MainBottom;
 background: goldenrod;
  border-radius: 10px;
  border: 6px solid black;
}

body {
  background-image: url('./images/background.jpg');
  background-size:cover;
  
  background-repeat: repeat-y;
}

img{
  width: 120px;
  height: 120px;
  
 
  border-radius: 140%;
  
   border: 5px solid black;
  
}

.flex-container{
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: stretch;
  padding-top: 20px;
  padding-left: 10px;
  background-color: goldenrod;

}

.title{
  font: bold;
  font-size: 100px;
  
 
  color: goldenrod;
  justify-items: right;
  font-family: 'Bierg', sans-serif;
  border: 5px  solid black ;
  padding-left: 1%;
  padding-right: -10%;
  border-radius: 10px;
  background-color:brown;
  border-style: ridge;
 
}

/* .form-signin{
  float: right;
  background-color: rgb(233, 218, 153);
  border: 5px solid black;
  border-radius: 12px;
  padding: 4%;

  flex-grow: 1;
} */

.title:hover{
  border: 5px  solid yellow ;
}
@import url('http://fonts.cdnfonts.com/css/biergarten');

</style>

