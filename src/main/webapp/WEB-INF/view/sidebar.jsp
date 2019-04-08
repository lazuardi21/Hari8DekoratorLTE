<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

        <!-- Sidebar Menu -->
        <ul class="sidebar-menu" data-widget="tree">
            <li class="header">MENU</li>

            <li ${param.page == "order" ? "class=active" : ""}>
                <a href="order"><i class="fa fa-shopping-cart"></i> <span>Data Order</span></a>
            </li>
            <li ${param.page == "barang" ? "class=active" : ""}>
                <a href="barang"><i class="fa fa-tags"></i> <span>Data Barang</span></a>
            </li>
        </ul>
        <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
</aside>