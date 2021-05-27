<template>
  <div>
    <update-brewery-form v-bind:breweryNumber="parseInt($route.params.id)" />
  </div>
</template>

<script>
import UpdateBreweryForm from "../components/UpdateBreweryForm.vue";
export default {
  components: { UpdateBreweryForm },
};
</script>

<style>
</style>