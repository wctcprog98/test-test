<template>
  <div>
    <h2>{{ brewery.breweryName }}</h2>
    <h2>{{ brewery.breweryCity + "," + brewery.breweryState }}</h2>
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
</style>