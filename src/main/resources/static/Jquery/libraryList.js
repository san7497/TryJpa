/**
 * 
 */
	$(document).ready(function() {
		var table =$('#myTable').DataTable();
		
		 $.ajax({url: "/getBooks", success: function(result){

			    for(var i=0;i<result.length;i++)
			    	{			    	
			    	table.row.add([result[i].book_id,result[i].title,result[i].author,result[i].year]).draw();
			    	}
			  }});
	});