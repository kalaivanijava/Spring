<html>
<head><title>Book Details</title></head>
<body>
    <center> 
    <h5>Book Details</h5>
    
      <font color="blue" >   </br>BookName=${details.bName}</br>
      Author=${details.bAuthor} </br>BookID=${details.bID} </font> 
            </br></br>
           Date:<p id="date"></p>
<script>

document.getElementById("date").innerHTML = new Date().toDateString();
</script>
    </center>
  </body>
</html> 