<html>
<head><title>Book Details</title></head>
<body>
    <center> 
    <h5>Student Marklist</h5>
    
      <font color="blue" >   </br>StudentName=${details.sname}</br>
      Tamil mark=${details.tamil} </br>English mark=${details.english} </br>
      Maths mark=${details.maths}</font> 
       </br>
       </br>
          Date: <p id="date"></p>
<script>
document.getElementById("date").innerHTML = new Date().toDateString();
</script>
    </center>
  </body>
</html> 