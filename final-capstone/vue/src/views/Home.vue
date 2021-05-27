<template>
  <div class="home">
    <h1>Home</h1>
    <p>You must be authenticated to see this</p>
    <new-brewery-form />
  </div>
</template>

<script>
import NewBreweryForm from '../components/NewBreweryForm.vue';


export default {
  components: { NewBreweryForm },
  name: "home"
 
};
</script>

    