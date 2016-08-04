<#import "../layout.ftl" as layout>
<@layout.mainLayout "Сотрудник">

	<div class="yui-bc">
		<ul class="yui-bc_items">
			<li class="yui-bc_item">
				<a class="yui-bc_link" href="/">Главная</a> <span class="yui-bc_divide">&rarr;</span>
			</li>
			<li class="yui-bc_item bc_item--active">
				<a class="yui-bc_link" href="">Сотрудники</a>
			</li>
		</ul>
	</div>
	<div class="yui-row"></div>
	<div class="yui-block yui-block--yellow">
		<div class="yui-block_header">Сотрудники</div>
		<div class="yui-block_body">
			<div style="padding-left: 20px;">
				<ul>
					<#list employees as employee >
						<li><a href="/employees/${ employee.id }/">${ employee.fullname }</a></li>
					</#list>
				</ul>

				<a href="/employees/create/" class="yui-btn yui-btn--green">Добавить</a>
			</div>
		</div>
	</div>

</@layout.mainLayout>