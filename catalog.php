<?php
	
	$servername="localhost";
	$username="root";
	$password="";
	$dbname="coursework";
	
	$conn=new mysqli($servername,$username,$password,$dbname);

	if($conn->connect_error){
		die("Connection Failed".$conn->connect_error);
	}else{
  	
	  	$query_companyany = "SELECT * from company";
	  	$result_companyany = mysqli_query($conn,$query_company);


	  	$query_department = "SELECT * from department";
	  	$result_department = mysqli_query($conn,$query_department);

	  	$query_ceo = "SELECT * from ceo";
	  	$result_ceo = mysqli_query($conn,$query_ceo);

	  	$query_pm = "SELECT * from project_manager";
	  	$result_pm = mysqli_query($conn, $query_pm);


		$xml = new DomDocument("1.0");
		$xml->formatOutput= true;

		$company = $xml->createElement("company");
		$xml->appendChild($company);

		while($row = mysqli_fetch_assoc($result_company)){
		 
		 	$company_name = $xml->createElement("company_name", $row["name"]);
		 	$company_address = $xml->createElement("company_address", $row["address"]);
		 	$company_phone = $xml->createElement("company_phone", $row["phone"]);
		 	$company_email = $xml->createElement("company_email", $row["email"]);
		 	$company_website = $xml->createElement("website", $row["website"]);
		 	$company_logo = $xml->createElement("company_logo");
			$ceo = $xml->createElement("ceo");
			$project_Managers = $xml->createElement("project_managers");
			$departments = $xml->createElement("departments");

			$company->appendChild($company_logo);
		 	$company->appendChild($company_name);
		 	$company->appendChild($company_address);
		 	$company->appendChild($company_phone);
		 	$company->appendChild($company_email);
		 	$company->appendChild($company_website);
		 	$company->appendChild($ceo);
		 	$company->appendChild($managers);
		 	$company->appendChild($departments);

		}

		while($row = mysqli_fetch_assoc($result_ceo)){
			$ceo_name = $xml->createElement("ceo_name", $row["name"]);
			$ceo_phone1 = $xml->createElement("ceo_phone", $row["phone1"]);
			$ceo_email = $xml->createElement("ceo_email", $row["email"]);
			$ceo_phone2 = $xml->createElement("ceo_phone", $row["phone2"]);
			$ceo_address = $xml->createElement("ceo_address", $row["address"]);
			$ceo_salary= $xml->createElement("ceo_salary", $row["salary"]);

			$ceo->appendChild($ceo_name);
			$ceo->appendChild($ceo_phone1);
			$ceo->appendChild($ceo_address);
			$ceo->appendChild($ceo_phone2);			
			$ceo->appendChild($ceo_email);
			$ceo->appendChild($ceo_salary	);
		}


		while($row = mysqli_fetch_assoc($result_department)){
			$department = $xml->createElement("department");
			$departments->appendChild($department);
			$department->setAttribute("id", $row["id"]);
			$department_name = $xml->createElement("department_name", $row["name"]);
			$department->appendChild($department_name);
			$department_email = $xml->createElement("department_email", $row["email"]);
			$department->appendChild($department_email);
			
			
			$department_phone1 = $xml->createElement("department_phone", $row["phone1"]);
			$department->appendChild($department_phone1);
			$department_phone2 = $xml->createElement("department_phone", $row["phone2"]);
			$department->appendChild($department_phone2);
			$department_head = $xml->createElement("department_head", $row["head"]);
			$department->appendChild($department_head);
		
		
	}

	while($row = mysqli_fetch_assoc($result_pm)){
		$project_manager = $xml->createElement("project_manager");
		$project_manager->setAttribute("id", $row["id"]);
		$pm_id->$xml->createElement("id", $row["id"]);
		$pm_name = $xml->createElement("pm_name", $row["name"]);
		$pm__address =$xml->createElement("pm_address", $row["address"]);
		$pm_telephone = $xml->createElement("pm_phone", $row["phone"]);
		$pm_email = $xml->createElement("pm_email", $row["email"]);
		$pm_salary = $xml->createElement("pm_salary",$row["salary"]);


		$managers->appendChild($project_manager);
		$project_manager->appendChild($pm_)
		$project_manager->appendChild($pm_name);
		$project_manager->appendChild($pm_address);	
		$project_manager->appendChild($pm_phone);
		$project_manager->appendChild($pm_email);
		$project_manager->appendChild($pm_salary);
	}


		echo "<xmp>".$xml->saveXML()."</xmp>";

		$xml->save("catalog_xml	.xml");
	}










?>