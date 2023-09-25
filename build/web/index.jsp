<%-- 
    Document   : index
    Created on : 22 sep. 2023, 10:28:51
    Author     : jahsin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import = "modelo.Puesto" %>
<%@page import = "java.util.HashMap" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
        <title>Formulario de registro sadebb</title>
    </head>
    <body>
        <h1>Registro Colaborador</h1>
        
        <div class ="container">           
  
        <form action="sr_empleado" method ="post" class="form-group">
            <label for="lbl_codigo"><b>Codigo:</b></label>
            <input type="text" name="txt_codigo" id ="txt_codigo" class="form-control" placeholder="Ingrese el codigo" required> 
            
            <label for="lbl_nombres" ><b> Nombres:</b></label>
            <input type ="text" name="txt_nombres" id="txt_nombres" class="form-control" placeholder="Ingrese su nombre" required>
            
            <label for="lbl_apellidos" ><b> Apellidos:</b></label>
            <input type ="text" name="txt_apellidos" id="txt_apellidos" class="form-control" placeholder="Ingrese su Apellido" required>
            
            <label for="lbl_direccion" ><b> Direccion: </b></label>
            <input type ="text" name= "txt_dir" id="txt_dir" class="form-control" placeholder="Ingrese su Direccion" required>
            
            <label for="lbl_telefono" ><b> Telefono:</b></label>
            <input type ="number" name="txt_telefono" id="txt_telefono" class="form-control" placeholder="Ingrese su Fecha" required>
            
            <label for="lbl_fn" ><b> Fecha Nacimiento:</b></label>
            <input type ="date" name="txt_fn" id="txt_fn" class="form-control" placeholder="Ingrese su fecha Nacimiento" required>
            
            <label for="lbl_puesto"><b> Puesto </b></label>
            <select name="drop_puesto" id="drop_puesto" class="form-control">
                    <%
                        Puesto puesto = new Puesto();
                        HashMap<String, String> drop = puesto.drop_Puesto();
                        for(String i: drop.keySet()){
                        out.println("<option values '" + i + "'>" + drop.get(i)+ "</option>");
                        }
                    %>
            </select>
                
            <br>
           <button  name="btn_Agregar" id="btn_Agregar" value ="agregar" class="btn btn-primary">Agregar</button>
           <button  name="btn_Agregar" id="btn_Agregar" value ="agregar" class="btn btn-primary">Agregar</button>

         </form>
         </div>
               
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </body>
</html>
