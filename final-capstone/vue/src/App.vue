
<template>
  <div id="app">
    <router-view />
  </div>
</template>

<script>
export default {};
</script>

<style>
.DashBoard {
  box-sizing: border-box;

  display: grid;
  grid-template-rows: 1fr 5fr 3fr;
  grid-template-columns: 1fr 1fr;
  grid-gap: 3%;
  grid-template-areas:
    "Header Header Header"
    "BreweryCard TopRated TopRated"
    "BreweryCard events-list events-list";
    max-height: 1350px;
}

.Header {
  grid-area: Header;
  background: transparent;
  /* 
   */
  height: 350px;
  border-radius: 10px;
  border: 6px solid black;
  
}
/* brewery card on home page */
.flex-container-card { 
  display: flex;
  justify-content: space-between;
  align-items: flex-end;
}

.flex-container-card button {
  height: 20px;
}

.BreweryCard {
  grid-area: BreweryCard;
  background: transparent;
  border-radius: 10px;
  border: 6px solid black;
  overflow-y: scroll;
  max-height: 120vh;
}

/* card temp border */
.card {
  border: 2px solid black;
  border-radius: 15px;
  padding: 3px;
  margin: 4%;
  box-shadow: 3px 2px 14px rgba(white, 0.2);
  transition: all 200ms ease-in-out;
  background-color:transparent; 
  /* beer card */
  color: gold;
   filter: blur(.7px);
  /* font-size: 20px; */
 
  /* test */
}


.card:hover{
  transform: translateY(-1rem);
  box-shadow: 3px 2px 18px rgba(255.255.255, 0.4);
   color: gold;
   font-weight:bolder;
   font-size: 17px;
   text-decoration: underline;
   border-bottom: 6px solid black;
   border-right: 6px solid black;
   border-top: 0px;
   border-left: 0px;
   filter: blur(0px);
   
}

.user-info {
  display: flex;
  flex-direction: column;
  border: 2px solid black;
  padding: 1.25em;
  width: 150px;
}


/* end of card test */

.TopRated {
  grid-area: TopRated;
  background: transparent;
  border-radius: 10px;
  border: 6px solid black;
  max-height: 60vh;
}

.events-list {
  grid-area: events-list;
  background: transparent;
  border-radius: 10px;
  border: 6px solid black;
  height: 50vh;
  max-height: 90vh;
  margin-bottom: 14.8%;
  padding-bottom: 10px;
  
  
}

body {
  background-image: url("./images/background.jpg");
  background-size:110%;
  background-repeat: repeat-y;
  /* ADDITION */
  font-family: "Papyrus";

  /* font-family: "Fantasy"; */
  
}

/* ADDITION */
.text {
  color: white;
}

img {
  width: 180px;
  height: 170px;

  border-radius: 140%;

  border: 5px solid black;
}

img:hover{
  border: 6px solid black;
}

.flex-container {
  display: flex;
  flex-direction: row;
  justify-content: space-around;
  align-items: center;
  padding-top: 20px;
  padding-left: 10px;
  background-color: transparent;
  /* flexbox in header */
  height: 130px;
  margin-top: 70px;
}

.title {
  font: bold;
  font-size: 100px;

  color: #ffd700;
  justify-items: right;
  border: 5px solid black;
  padding-left: 1%;
  padding-right: -10%;
  border-radius: 10px;
  background-color: #a52a2a;
  border-style: ridge;
}

.form-signin {
  height : auto;
  width: 250px;
  float: left;
  /* background-color: rgb(233, 218, 153); */
  background-color: rgb(226, 199, 47);
  border: 3px solid black;
  border-radius: 12px;
  padding: 3%;

}
.brewery-label{
  color:white;
  
}

.title:hover {
  border: 5px solid yellow;
}
@import url("http://fonts.cdnfonts.com/css/biergarten");
@import url('https://fonts.googleapis.com/css2?family=Bungee+Shade&display=swap');
</style>

