	<div class="container" th:each="project: ${projects}">
		<a th:href="@{/project(id=${project.id})}"><img
			class="coverPhotos" th:src="${project.projImage}"></img></a><a
			th:href="@{/project(id=${project.id})}"></a>
	</div>