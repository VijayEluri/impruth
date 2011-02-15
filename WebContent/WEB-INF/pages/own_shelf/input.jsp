<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>所有書籍情報</title>
		<script language="JavaScript" src="js/barcode.js" >
		</script>
		<script language="JavaScript">

		var myEditForm;

		/**
		 * バーコードスキャンボタンをクリック
		 */
		function onClickScanBarcodeButton(myForm,jsonUrl){
			myEditForm = myForm;
		    var barcode = myForm.ownList_ownBook_barcode.value;
			if(!onScanBarcode(barcode)){
				alert('バーコードが正しくありません'); 
				return false;
			}
			// Webから抽出させます... //
			jsonUrl += "?barcode="+barcode;
			callJson(jsonUrl);
			
			
			
		}

		/**
		 * バーコードのJOSON結果を処理します
		 */
		function populateJSON(result){
			// jsonの結果を格納します
			var jsonResultObject = eval('('+result+')');
			myEditForm.title.value=jsonResultObject.jsonBook.title;
			myEditForm.author.value=jsonResultObject.jsonBook.authorName;
			myEditForm.publisher.value=jsonResultObject.jsonBook.publishCompanyName;
			// myEditForm.new_newBook_releaseDate.value=jsonResultObject.jsonBook.releaseDate;
		}
		
		/**
		 * HTTPリクエスト
		 */
		var httpRequest;

		function callJson(url){
			if(window.XMLHttpRequest){
				httpRequest = new XMLHttpRequest();
			}
			else if ( window.ActiveXObject ){
				httpRequest = new ActiveXObject("Microsoft.XMLHTTP");
			}
			httpRequest.open("GET", url, true);
			httpRequest.onreadystatechange = callback;
			httpRequest.send(null);
		}

		function callback(){
			if(httpRequest.readyState==4){
				if(httpRequest.status==200){
					populateJSON(httpRequest.responseText);
				}
			}
		}
		</script>
	</head>
	<body>
所有書籍情報 : <s:property value="user.firstName" /><Br>
<s:form theme="simple">
<s:submit method="onClickAddOwnBook" value="+ 新規追加"  disabled="disabled"/>
<s:submit method="onClickAddOwnBook" value="= 一覧"  disabled="disabled"/>
</s:form>
<s:form theme="simple">
		<table border="1">
			<thead>
				<tr>
					<th>バーコード</th>
					<th>タイトル</th>
					<th>著者</th>
					<th>出版社</th>
				</tr>
			</thead>
			<tbody>
				<tr><s:url var="urlBarcodeJson" action="scanBarcode" />
					<td><s:textfield name="ownBook.barcode"/><input type="button" value="スキャン"  onclick="onClickScanBarcodeButton(this.form,'<s:property value="%{urlBarcodeJson}" />')"/></td>
					<td><input name="title" disabled="disabled"/></td>
					<td><input name="author" disabled="disabled"/></td>
					<td><input name="publisher" disabled="disabled"/></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="4">
						<s:submit value="新規登録" method="onClickRegist"/>
					</td>
				</tr>
			</tfoot>
		</table>
</s:form>
</body>
</html>