<#import "../layout.ftl" as layout>
<@layout.mainLayout "Сотрудник">

	<div class="yui-bc">
		<ul class="yui-bc_items">
			<li class="yui-bc_item">
				<a class="yui-bc_link" href="/">Главная</a> <span class="yui-bc_divide">&rarr;</span>
			</li>
			<li class="yui-bc_item">
				<a class="yui-bc_link" href="/employees/">Сотрудники</a> <span class="yui-bc_divide">&rarr;</span>
			</li>
			<li class="yui-bc_item bc_item--active">
				<a class="yui-bc_link" href="">Редактировать сотрудника</a>
			</li>
		</ul>
	</div>
	<div class="yui-row"></div>
	<div class="yui-block yui-block--yellow">
		<div class="yui-block_header">Редактировать cотрудника - ${ employee.fullname }</div>
		<div class="yui-block_body">
			<div style="padding-left: 20px;">
				<form method="POST" action="/employees/${ employee.id }/">
					<input name="fullname" type="text" class="yui-input-control" placeholder="ФИО" value="${ employee.fullname }" required="required" />
					<input name="birthday" type="date" class="yui-input-control" placeholder="Дата рождения" value="${ employee.birthday }"required="required" />
					<select name="department">
					 	<#list departments as department >
					 		<#if department.id == department.employee_department >
					 			<option value="${ department.id }" selected="selected">${ department.name }</option>
					 		<#else>
					 			<option value="${ department.id }">${ department.name }</option>
					 		</#if>
					 	</#list>
					</select><br>
					<input type="hidden" name="id" value="${ employee.id }"/>
					<input type="hidden" name="_METHOD" value="PUT"/>
					<button class="yui-btn yui-btn--green" type="submit">Редактировать</button>
				</form>
			</div>
		</div>
	</div>

</@layout.mainLayout>