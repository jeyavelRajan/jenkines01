<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Insert title here</title>

<style type="text/css">
.card{
margin-left:15%;
}

b{
text-align:center;
}


</style>


</head>
<body>



<center><h2>CARZ.com</h2></center>
<div class="card" style="width:70%" >
<div class="card-body">
<form action="CarController">

     <div class="form-group row">
      <label for="Doctor ID" class="col-sm-2 col-form-label" style="color:white">Car No</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="CarNo" placeholder="ID">
      </div>
     </div>
  
     
     <br>
     
          <div class="form-group row">
      <label for="Manufacture" class="col-sm-2 col-form-label" style="color:white">Manufacture</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="Manufacture" placeholder="Manufacture">
      </div>
     </div>
        <br>
        
                                 <div class="form-group row">
      <label for="Model" class="col-sm-2 col-form-label" style="color:white">Car Model</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="Model" placeholder="Model">
      </div>
     </div>
        <br>
     
               <div class="form-group row">
      <label for="KmsRan" class="col-sm-2 col-form-label" style="color:white">KmsRan</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="KmsRan" placeholder="KmsRan">
      </div>
     </div>
        <br>
        
             
               <div class="form-group row">
      <label for="PriceExcepted" class="col-sm-2 col-form-label" style="color:white">PriceExcepted</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="PriceExcepted" placeholder="PriceExcepted">
      </div>
     </div>
        <br>
        
             
               <div class="form-group row">
      <label for="NoOfOwners" class="col-sm-2 col-form-label" style="color:white">NoOfOwners</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="NoOfOwners" placeholder="NoOfOwners">
      </div>
     </div>
        <br>
     
     <button type="submit" class="btn btn-secondary" value="Insert Car" name="cms_button" style="color:white">Insert</button>
    
     </form>
</div>
</div>

</body>
</html>