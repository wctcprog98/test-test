<template>
  <div>
    <div class="beer-summary">
      <div class="beer-menu-box" v-on:click.prevent="toggleHidden()">
        <div><img class="beerimg" :src="beer.beerImage" /></div>
        <a href="" class="beer-name-link"
          ><div class="beer-name">{{ beer.beerName }}</div></a
        >
        <div class="beer-style">{{ beer.beerStyle }}</div>
        <div class="beer-abv">{{ beer.beerAbv + "%" }}</div>
      </div>
      <beer-detail v-show="!isHidden" v-bind:beer="beer" />
      <button
        class="btn"
        v-show="!isHidden"
        v-on:click.prevent="toggleHidden()"
      >
        Minimize
      </button>
    </div>
  </div>
</template>

<script>
import BeerDetail from "./BeerDetail.vue";
export default {
  components: { BeerDetail },
  data() {
    return {
      isHidden: true,
    };
  },
  props: {
    beer: Object,
  },
  methods: {
    toggleHidden() {
      this.isHidden = !this.isHidden;
    },
  },
};
</script>

<style >
.beer-menu-box{
  border: 1px solid gold;
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-radius: 15px;
  padding: 1%;
  margin: 2%;
  box-shadow: 3px 2px 14px rgba(white, 0.2);
  transition: all 200ms ease-in-out;
  background-color: white;
  margin-left: -1%;
  /* beer card */
  opacity: 50%;
  color: rgb(8, 8, 4);
  filter: blur(0.7px);
  
}
.beer-menu-box:hover{
  transform: translateY(-1rem);
  box-shadow: 3px 2px 18px rgba(255.255.255, 0.4);
  color: rgb(8, 8, 4);
  font-weight: bolder;
  font-size: 17px;
  font-size: 45px;
  border-bottom: 6px solid black;
  border-right: 6px solid black;
  border-top: 0px;
  border-left: 0px;
  filter: blur(0px);
  opacity: 90%;
}
.beerimg{
  border: 0px;
  border-radius: 4px;
  
  
}
.beerimg:hover{
border: 0px;
}
</style>