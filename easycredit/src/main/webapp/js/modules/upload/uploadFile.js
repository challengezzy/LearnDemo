/*=======================================*/
/*	uploadDemo功能的js                     */
/*	@author 王勇                         */
/*	2014年9月1日21:36:07                   */
/*=======================================*/
$(document).ready(function(){
	
});

//表单提交新增失败后,返回回调函数,传回错误信息
function uploadSucced(msg){
//	var btn = $("#createPeriadBtn");
//	btn.button('reset');
	$("#uploadSucceedMsg").html(msg);
	$("#uploadSucceed").show();
	$("#uploadFailed").hide();
}
//表单提交修改失败后，传回提示信息
function uploadFailed(msg){
//	var btn = $("#updateperiadBtn");
//	btn.button('reset');
	$("#uploadFailedMsg").html(msg);
	$("#uploadFailed").show();
	$("#uploadSucceed").hide();
}