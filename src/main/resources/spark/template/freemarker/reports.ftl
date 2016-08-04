<#import "layout.ftl" as layout>
<@layout.mainLayout "Отчеты">

	<div class="yui-bc">
		<ul class="yui-bc_items">
			<li class="yui-bc_item">
				<a class="yui-bc_link" href="/">Главная</a> <span class="yui-bc_divide">&rarr;</span>
			</li>
			<li class="yui-bc_item bc_item--active">
				<a class="yui-bc_link" href="">Отчеты</a>
			</li>
		</ul>
	</div>
	<div class="yui-row"></div>
	<div class="yui-block ">
		<div class="yui-block_header">Отчеты</div>
		<div class="yui-block_body">
			<div class="yui-row">
				<div class="yui-col yui-col--20 yui-col-offset--10"><h3></h3></div>
				<div class="yui-col yui-col--20">
					<h3>Количество сотрудников</h3>
				</div>
				<div class="yui-col yui-col--20">
					<h3>Средний возраст сотрудников</h3>
				</div>
			</div>

			<#list departments as dep >
				<div class="yui-row">
					<div class="yui-col yui-col--20 yui-col-offset--10">
						${ dep.name }
					</div>
					<div class="yui-col yui-col--20">
						${ dep.count }
					</div>
					<div class="yui-col yui-col--20">
						${ dep.avg }
					</div>
				</div>
			</#list>
		</div>
	</div>

</@layout.mainLayout>