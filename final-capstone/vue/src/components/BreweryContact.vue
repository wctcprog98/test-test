<template>
  <div class="contact">
    <h2>{{ brewery.breweryName }}</h2>
    <h3>{{ brewery.breweryStreetAddress }}</h3>
    <h3>{{ brewery.breweryCity }}</h3>
    <h3>{{ brewery.breweryState }}</h3>
    <h3>{{ brewery.breweryZipCode }}</h3>
    <h3>{{ brewery.breweryWebsite }}</h3>
  </div>
</template>

<script>
export default {
  props: {
    brewery: Object,
  },
};
</script>

<style>
.contact {
  background-color: white;
}
</style>