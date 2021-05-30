
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
}

.Header {
  grid-area: Header;
  background: #ffd700;
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
  background: #ffd700;
  border-radius: 10px;
  border: 6px solid black;
}

/* card temp border */
.card {
  border: 2px solid black;
  border-radius: 15px;
  padding: 3px;
  margin: 4%;
  box-shadow: 3px 2px 14px rgba(white, 0.2);
  transition: all 200ms ease-in-out;
  background-color:#a52a2a;
  color: silver;
  /* font-size: 20px; */

  /* test */
}


.card:hover{
  transform: translateY(-1rem);
  box-shadow: 3px 2px 18px rgba(255.255.255, 0.4);
   color: white;
   font-weight:bolder;
   text-decoration: underline;
   border-bottom: 6px solid black;
   border-right: 6px solid black;
   border-top: 0px;
   border-left: 0px;
   
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
  background: #ffd700;
  border-radius: 10px;
  border: 6px solid black;
}

.events-list {
  grid-area: events-list;
  background: #ffd700;
  border-radius: 10px;
  border: 6px solid black;
}

body {
  background-image: url("./images/background.jpg");
  background-size:100%;
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
  background-color: #ffd700;
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
  background-color: rgb(187, 118, 53);
  border: 5px solid black;
  border-radius: 12px;
  padding: 3%;

}

.title:hover {
  border: 5px solid yellow;
}
@import url("http://fonts.cdnfonts.com/css/biergarten");
@import url('https://fonts.googleapis.com/css2?family=Bungee+Shade&display=swap');
</style>

