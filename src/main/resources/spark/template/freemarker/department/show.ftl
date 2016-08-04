<#import "../layout.ftl" as layout>
<@layout.mainLayout "Департамент">

	<div class="yui-bc">
		<ul class="yui-bc_items">
			<li class="yui-bc_item">
				<a class="yui-bc_link" href="/">Главная</a> <span class="yui-bc_divide">&rarr;</span>
			</li>
			<li class="yui-bc_item bc_item">
				<a class="yui-bc_link" href="/departments/">Департаменты</a> <span class="yui-bc_divide">&rarr;</span>
			</li>
			<li class="yui-bc_item bc_item--active">
				<a class="yui-bc_link" href="">${department.getName()}</a>
			</li>
		</ul>
	</div>
	<div class="yui-row"></div>
	<div class="yui-block yui-block--blue">
		<div class="yui-block_header">${department.getName()}</div>
		<div class="yui-block_body">
			<div style="padding-left: 20px;">
				<#if employees?size = 0 >
					<p>Сотрудники отсутствуют</p>
				</#if>
				<#if (employees?size > 0) >
					<h3>Сотрудники</h3>
					<ul>
						<#list employees as employee >
							<li><a href="/employees/${employee.getId()}/">${employee.getFullname()}</a></li>
						</#list>
					</ul>
				</#if>

				<a href="/departments/${ department.id }/edit/" class="yui-btn yui-btn--blue">Редактировать</a>
				<button class="yui-btn yui-btn--red delete">Удалить</button>
			</div>
		</div>
	</div>


	<form style="display: hidden" action="/departments/${ department.id }/" method="POST" id="formDelete">
  		<input type="hidden" name="_METHOD" value="DELETE">
	</form>

</@layout.mainLayout>