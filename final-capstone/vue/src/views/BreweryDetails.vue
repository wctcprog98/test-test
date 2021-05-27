<template>
  <div>
    <button v-on:click="showUpdateForm()">Show Form</button>
    <update-brewery-form
      v-if="this.$store.state.showUpdateBreweryForm"
      v-bind:breweryNumber="parseInt($route.params.id)"
    />
  </div>
</template>

<script>
import UpdateBreweryForm from "../components/UpdateBreweryForm.vue";
export default {
  components: { UpdateBreweryForm },
  methods: {
    showUpdateForm() {
      this.$store.commit("TOGGLE_UPDATE_BREWERY");
    },
  },
};
</script>

<style>
</style>