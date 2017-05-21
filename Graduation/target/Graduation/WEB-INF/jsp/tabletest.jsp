<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Working Flow System</title>
	    <meta name="author" content="pengfei.zhao">
	    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
	    <link rel="icon" href="images/favicon.ico" type="image/x-icon">
	
	    <!-- Mobile Specific Metas -->
	    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	
	    <!-- stylesheet -->
	    <link rel="stylesheet" href="css/bootstrap.css" type="text/css" media="screen"/>
		<link rel="stylesheet" href="css/bootstrap-table.css" type="text/css" media="screen"/>
	
	    <!-- js code -->
	    <script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
	    <script type="text/javascript" src="js/bootstrap.min.js"></script>
	    <script type="text/javascript" src="js/bootstrap-table.min.js"></script>
	    <script type="text/javascript" src="js/bootstrap-table-zh-CN.min.js"></script>
	</head>
	<body>
	    <div class="container" style="background-color: whitesmoke;">
	        <div class="row">
	            <div class="col-lg-8 col-lg-offset-2">
	                <div>
	                	<table id="table"></table>
	                	<button id="bt" class="btn btn-success">点击</button>
	                </div>
	        	</div>
	    	</div>
    	</div>
    </body>	

    <script type="text/javascript">
    	var data = [{
		        id: 1,
		        name: 'Item 1',
		        price: '$1'
			    }, {
			        id: 2,
			        name: 'Item 2',
			        price: '$2'
			    }]
		$("#table").bootstrapTable({
		    columns: [{
		        field: 'id',
		        title: 'Item ID'
		    }, {
		        field: 'name',
		        title: 'Item Name'
		    }, {
		        field: 'price',
		        title: 'Item Price'
		    }],
		    data: data
		});    	
    </script>
</html>