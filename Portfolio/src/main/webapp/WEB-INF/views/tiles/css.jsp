<!-- Custom fonts for this template-->
<link href="${pageContext.request.contextPath}/resources/bootstrap/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="${pageContext.request.contextPath}/resources/bootstrap/css/sb-admin-2.min.css" rel="stylesheet">

<!-- crousel CSS -->
<style>
        @import url(https://fonts.googleapis.com/css?family=Open+Sans:300,400);
        .carousel-view{
            display: inline-block;
            position: relative;
            margin: 0 auto;
            border: 1px dotted red;
        }
        .carousel-container{
            white-space: nowrap;
            font-size: 0;
            margin: 0;
            padding: 0;
        }
        .carousel-item{
            display: inline-block;
            list-style: none;
            padding: 5px;
        }
        .carousel-item:last-child{
            margin-right: 0;
        }
        .carousel-control{
            position: absolute;
            top: 50%;
            transform: translateY(-50%);
            font-size: 2em;
            color: #000;
            background-color: transparent;
            border-color: transparent;
            cursor: pointer;
            z-index: 99;
        }
        .carousel-control:focus{
            outline: none;                              
        }
        .carousel-control.prev{
            left: 0;
        }
        .carousel-control.next{
            right: 0;
        }
    </style>