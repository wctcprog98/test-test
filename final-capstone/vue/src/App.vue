<template>
  <div id="app">
    <div id="nav">
      <router-link v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
   
    </div>
    <router-view />
    <div>
      <new-brewery-form />
    </div>
    <div>
      <update-brewery-form />
    </div>
    <div>
      <p v-for="brewery in this.breweries" v-bind:key="brewery.id"> {{brewery.breweryName}} </p>
      
    </div>
  </div>
</template>

<script>
import  BreweryService  from '@/services/BreweryService'
import NewBreweryForm from './components/NewBreweryForm.vue';
import UpdateBreweryForm from './components/UpdateBreweryForm.vue';

export default {
  components: { NewBreweryForm, UpdateBreweryForm },
  data() {
    return {
      breweries: []
    }
  },
  created() {
    BreweryService.list().then(response => {

      this.breweries = response.data;
    });
  }

}

</script>

