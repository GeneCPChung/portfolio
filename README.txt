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



	