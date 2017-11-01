	<div class="container" th:each="project: ${projects}">
		<a th:href="@{/project(id=${project.id})}"><img
			class="coverPhotos" th:src="${project.projImage}"></img></a><a
			th:href="@{/project(id=${project.id})}"></a>
	</div>
	
	

.container {
	display: grid;
	grid-template-columns: 1fr 1fr;
	grid-gap: 10px;
	height: calc(100vh - (var(--grid-gap) * 2));
	margin: 2em auto auto;
	width: 45%;
}

.header {
	display: grid;
	background: radial-gradient(circle at center, #F4F3F4, #7A6D67, #3F3539);
	border-radius: 10px;
	border: 2px solid #F4F3F4;
	
	margin: 1em;
	padding: 10px;
	
}

.main {
	display: grid;
	
}



#back {
	font-size: 150%;
	text-align: center;
}

#header-resize {
max-height: 55%;	
max-width: 25%;
}


.sm-header {
	color: #F4F3F4;
}

body {
	background-image: radial-gradient(circle at center, rgba(63, 53, 57, 0.75),
		#F4F3F4), url("/images/movie-reel.jpg");
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
	background-opacity: 0.35;
}

div.image {
	background-image: url("/images/portfoliopicture.jpg");
	bakcground-size: cover;
	width: 200px;
	height: 100px;
	border-radius: 100px / 50px;
}

h1 {
	color: #F4F3F4;
	font-family: Times New Roman;
	text-align: left;
}

h2 {
	color: #3F3539;
	font-family: Times New Roman;
	font-size: 150%;
}

img {
	border-radius: 10px;
	
	margin: auto;
	width: 100%;
}

p {
	color: #3F3539;
	font-size: 1.25em;
}

section {
	text-align: center;
	font-size: 1.25em;
}




<div class="container">
		<a th:each="project: ${projects}"
			th:href="@{/project(id=${project.id})}"><img
			th:src="${project.projImage}"></img></a>
	</div>


///////////////////////////////////////////////////////

footer {
    display: flex;
    align-items: center;
    flex-direction: column;
    padding: 1rem;

}

header {
    align-items: center;
    display: flex;
    flex-direction: column;
}

ol,
ul {
    padding: 0;
}

.card {
    margin-bottom: 1rem;
    padding: 1rem;
}

.container {
    margin: 0 auto;
    max-width: 1000px;
    width: 90%;
}

@media(min-width: 768px){
 header {
    flex-direction: row;
    grid-column: 1 / -1;
    justify-content: space-between;
 }
nav ul {
    -ms-align-items: center;
    align-items: center;
    display: flex;
    flex-direction: row;

}
nav ul li {
    margin: 5px;
}
.container {
    display: grid;
    grid-gap: 1rem;
    grid-template-columns: 3fr 2fr;
}
}

/*
/*
* {
    box-sizing: border-box;
    margin: 0;
    padding: 0;
}
aside,
footer,
header,
main {
    padding: 17px;
}
footer {
    grid-column: 1 / -1;
}
header {
    grid-column: 1 / -1;
}
nav {
    padding: 5px;
}
    nav li {
        margin: 3px;
    }
.btn {
    margin: 5px;
    padding: 5px 9px;
}
.card {
    margin: 11px;
    padding: 19px;
}
    .card p {
        padding: 5px;
    }
.container {
    display: grid;
    grid-template-columns: 4fr 1fr;
    grid-template-rows: 75px auto 120px;
    min-height: 100vh;
}
.social-media {
    padding: 5px 9px;
}
/*
** FLEXBOX CHALLENEGE
** Complete all of the following challenges using flexbox
*/
/*/*
/* Put the company logo on the left side of the header and the nav on the right */
/*.btn {
    align-self: flex-start;
    margin-top: auto;
}
header {
    display: flex;
    justify-content: space-between;
}*/
/* Distribute the navigation items in a horizontal line 
ul {
    display: flex;
 justify-content: flex-end;   
}
/* Distribute cards in 'main' horizontally and make sure they all have the same height */
/*main .cards {
    display: flex;
    align-items: stretch;
    
    flex-direction: row;
}
main .cards .card {
    display: flex;
    flex: 1 250px;
    flex-direction: column;
}
main .cards .card p {
    margin-bottom: 1em;
}*/

/* Distribute cards in aside vertically and make sure any space left in the container is around the elements */
/*aside {
display: flex;
flex-direction: column;
justify-content: space-around;
}*/
/* In the footer, center the copyright and place the social-media links to the right */
/*small {
    display: flex;
    justify-content: center;
}
.social-media {
    align-self: flex-end;
}*/
	