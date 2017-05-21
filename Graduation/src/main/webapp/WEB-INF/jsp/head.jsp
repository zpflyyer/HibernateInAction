<c:set var="context" value="${pageContext.request.contextPath}"/>
<head>
    <!-- Basic Page Needs -->
    <meta charset="utf-8"/>

    <title>Intern Management System</title>
    <meta name="author" content="pengfei.zhao">
    <link rel="shortcut icon" href="${context}/images/favicon.ico" type="image/x-icon">
    <link rel="icon" href="${context}/images/favicon.ico" type="image/x-icon">

    <!-- Mobile Specific Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <!-- stylesheet -->
    <link rel="stylesheet" href="${context}/css/bootstrap.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="${context}/css/bootstrapValidator.min.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="${context}/css/bootstrap-table.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="${context}/css/bootstrap-editable.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="${context}/css/animate.css" >
    <link rel="stylesheet" href="${context}/css/style.css">
    <link rel="stylesheet" href="${context}/fonts/font-awesome/css/font-awesome.css">
    <!-- js code -->

    <script type="text/javascript" src="${context}/js/jquery-3.2.0.min.js"></script>
    <script type="text/javascript" src="${context}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${context}/js/json2.js"></script>
    <script type="text/javascript" src="${context}/js/chart.js"></script>
    <script type="text/javascript" src="${context}/js/bootstrapValidator.min.js"></script>
    <script type="text/javascript" src="${context}/js/metisMenu/jquery.metisMenu.js"></script>
    <script type="text/javascript" src="${context}/js/slimscroll/jquery.slimscroll.min.js"></script>
    <script type="text/javascript" src="${context}/js/jeditable/jquery.jeditable.js"></script>
    <script type="text/javascript" src="${context}/js/pace/pace.min.js"></script>
    <script type="text/javascript" src="${context}/js/inspinia.js"></script>
    <script type="text/javascript" src="${context}/js/bootstrap-editable.js"></script>
    <script type="text/javascript" src="${context}/js/bootstrap-table.min.js"></script>
    <script type="text/javascript" src="${context}/js/bootstrap-table-zh-CN.min.js"></script>
    <script type="text/javascript" src="${context}/js/bootstrap-table-editable.js"></script>


    <style>
    /* Custom Styles */
        ul.nav-tabs{
            width:180px;
            height: auto;
            margin-top: 30px;
            margin-left: 40px;
            border-radius: 4px;
            border: 1px solid #ddd;
            box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);
        }
        ul.nav-tabs li{
            margin: 0;
            border-top: 1px solid #ddd;
        }
        ul.nav-tabs li:first-child{
            border-top: none;
        }
        ul.nav-tabs li a{
            margin: 0;
            padding: 8px 16px;
            border-radius: 0;
        }
        ul.nav-tabs li.active a, ul.nav-tabs li.active a:hover{
            color: #fff;
            background: #0088cc;
            border: 1px solid #0088cc;
        }
        ul.nav-tabs li:first-child a{
            border-radius: 4px 4px 0 0;
        }
        ul.nav-tabs li:last-child a{
            border-radius: 0 0 4px 4px;
        }
        ul.nav-tabs.affix{
            top: 30px; /* Set the top position of pinned element */
        }
    </style>

</head>