<#import "../layout.ftl" as layout>
<@layout.mainLayout "Сотрудник">

	<div class="yui-bc">
		<ul class="yui-bc_items">
			<li class="yui-bc_item">
				<a class="yui-bc_link" href="/">Главная</a> <span class="yui-bc_divide">&rarr;</span>
			</li>
			<li class="yui-bc_item bc_item">
				<a class="yui-bc_link" href="/employees/">Сотрудники</a> <span class="yui-bc_divide">&rarr;</span>
			</li>
			<li class="yui-bc_item bc_item--active">
				<a class="yui-bc_link" href="">${ employee.fullname }</a>
			</li>
		</ul>
	</div>
	<div class="yui-row"></div>
	<div class="yui-block yui-block--yellow">
		<div class="yui-block_header">Сотрудник - ${ employee.fullname }</div>
		<div class="yui-block_body">
			<div style="padding-left: 20px;">
				<h3>ФИО: ${ employee.fullname }</h3>
				<h3>Дата рождения: ${ employee.birthday }</h3>
				<h3>Департамент: <a href="/departments/${ department.id }/">${ department.name }</a></h3>

				<a href="/employees/${ employee.id }/edit/" class="yui-btn yui-btn--icon yui-btn--blue"><span class="yui-icon-edit"></span>Редактировать</a>
				<button class="yui-btn yui-btn--icon yui-btn--red delete"><span class="yui-icon-delete"></span>Удалить</button>
			</div>
		</div>
	</div>

	<form style="display: hidden" action="/employees/${ employee.id }/" method="POST" id="formDelete">
  		<input type="hidden" name="_METHOD" value="DELETE">
	</form>

</@layout.mainLayout>