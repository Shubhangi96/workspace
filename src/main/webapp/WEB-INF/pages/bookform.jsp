<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>        
  
       <form:form method="post" action="savebook">    
        <table >    
         <tr>    
          <td>isbn : </td>   
          <td><form:input path="isbn"  /></td>  
         </tr>    
         <tr>    
          <td>Title :</td>    
          <td><form:input path="title" /></td>  
         </tr> 
         <tr>    
          <td>Author :</td>    
          <td><form:input path="author" /></td>  
         </tr>   
         <tr>    
          <td>Price :</td>    
          <td><form:input path="price" /></td>  
         </tr>   
         <tr>   
         <tr>    
          <td>stock :</td>    
          <td><form:input path="stock" /></td>  
         </tr>   
         <tr>    
          <td colspan="2"><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    