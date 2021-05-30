<template>
  <div>
    <div class="beer-summary">
      <div><img :src="beer.beerImage" /></div>

      {{ beer.beerName }}
      <div class="beer-style">{{ beer.beerStyle }}</div>
      <div class="beer-abv">{{ beer.beerAbv }}</div>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    beer: Object,
  },
};
</script>

<style>
</style>