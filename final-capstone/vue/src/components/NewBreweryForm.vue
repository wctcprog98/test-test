<template>
  <div>
    <form action="">
      <label for="brewery-name">Brewery Name</label>
      <input type="text" name="brewery-name" />

      <label for="brewer-id">Brewery ID</label>
      <input type="text" placeholder="do I work?" name="brewer-id" />

      <label for="brewery-address"> Address</label>
      <input type="text" name="brewery-address" />

      <label for="brewery-city"> City</label>
      <input type="text" name="brewery-city" />

      <label for="brewery-state"> State</label>
      <input type="text" name="brewery-state" />

      <label for="brewery-zip">Zip</label>
      <input type="text" name="brewery-zip" />

      <label for="brewery-website">Website</label>
      <input type="text" name="brewery-website" />
    <button>
        Submit
    </button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      BreweryForm : []
    };
  },
};
</script>

<style>
</style>