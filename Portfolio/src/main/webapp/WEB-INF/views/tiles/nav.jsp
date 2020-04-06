<ul
	class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
	id="accordionSidebar">

	<!-- Sidebar - Brand -->
	<a
		class="sidebar-brand d-flex align-items-center justify-content-center"
		href="/portfolio">
		<div class="sidebar-brand-icon rotate-n-15">
			<i class="fas fa-laugh-wink"></i>
		</div>
		<div class="sidebar-brand-text mx-3">Kim Hyeon Gyeom</div>
	</a>

	<!-- Divider -->
	<hr class="sidebar-divider my-0">

	<!-- Nav Item - Dashboard -->
	<li class="nav-item active"><a class="nav-link" href="/portfolio">
			<i class="fas fa-fw fa-tachometer-alt"></i> <span>Dashboard</span>
	</a></li>

	<!-- Divider -->
	<hr class="sidebar-divider">

	<!-- Heading -->
	<div class="sidebar-heading">Portfolios</div>


	<!-- Divider -->
	<hr class="sidebar-divider">
	<li class="nav-item"><a class="nav-link" href="#"
		data-toggle="collapse" data-target="#collapsePages"
		aria-expanded="true" aria-controls="collapsePages"> <i
			class="fas fa-user fa-sm fa-fw mr-2"></i> <span>Authentication</span>
	</a>
		<div id="collapsePages" class="collapse show"
			aria-labelledby="headingPages" data-parent="#accordionSidebar"
			style="">
			<div class="bg-white py-2 collapse-inner rounded">
				<a class="collapse-item" href="login">Login</a> <a
					class="collapse-item" href="register">Register</a> <a
					class="collapse-item" href="forgot-password">Forgot
					Password</a>
				<div class="collapse-divider"></div>
			</div>
		</div></li>
	<li class="nav-item">
		<!-- Wallet --> <a class="nav-link"
		href="${pageContext.request.contextPath}/portfolios/wallet"> <i
			class="fas fa-dollar-sign fa-sm fa-fw mr-2"></i><span>Wallet</span>
	</a>
	</li>
	<!-- Heading -->
	<div class="sidebar-heading">private</div>
	<hr class="sidebar-divider">
	<li class="nav-item">
		<!-- Profile --> <a class="nav-link"
		href="${pageContext.request.contextPath}/privates/profile"> <i
			class="fas fa-envelope fa-sm fa-fw mr-2"></i> <span>Contact</span>
	</a>
	</li>
	<hr class="sidebar-divider d-none d-md-block">

	<!-- Sidebar Toggler (Sidebar) -->
	<div class="text-center d-none d-md-inline">
		<button class="rounded-circle border-0" id="sidebarToggle"></button>
	</div>

</ul>