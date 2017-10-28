<?PHP
    include_once("connection.php");

if(isset($_POST['txtName']) && isset($_POST['txtQty']) && 
   isset($_POST['txtPrice']) && isset($_POST['txtImageUrl'])){
    $name = $_POST['txtName'];
    $qty = $_POST['txtQty'];
    $price = $_POST['txtPrice'];
    $image_url = $_POST['txtImageUrl'];

    $query = "INSERT INTO tbl_product(name, qty, price, image_url) 
    VALUES ('$name', $qty, $price, '$image_url')"; 
    
    $result = mysqli_query($conn, $query);

    if($result > 0){
        if(isset($_POST['mobile']) && $_POST['mobile'] == "android"){
            echo "success";
            exit;
        }
        echo "Insert Successfully";   
    }
    else{
        if(isset($_POST['mobile']) && $_POST['mobile'] == "android"){
            echo "failed";
            exit;
        }
        echo "Something Error";   
    }
}
    
?>
<html>
<head><title>Insert | KosalGeek</title></head>
    <body>
        <h1>Insert Example | <a href=”http://www.kosalgeek.com”>KosalGeek</a></h1>
        <form action="<?PHP $_PHP_SELF ?>" method="post">
            Name <input type="text" name="txtName" value=""/><br/>
            Qty <input type="text" name="txtQty" value=""/><br/>
            Price <input type="text" name="txtPrice" value=""/><br/>
            Image URL <input type="text" name="txtImageUrl" value=""/><br/>
            <input type="submit" name="btnSubmit" value="Insert"/>
        </form>
    </body>
</html>