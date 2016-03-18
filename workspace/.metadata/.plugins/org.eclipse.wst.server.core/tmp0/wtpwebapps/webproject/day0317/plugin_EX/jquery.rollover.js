
$.fn.rollover = function(){
	$(this).mouseover(function(){
		//괄호로 묶는 것이 그룹임.
		// \. 은 온점임. 그 점을 기준으로 앞에 그룹을 $1, 점을 포함한 뒤 그룹을 $2
		$(this).attr("src",$(this).attr("src").replace(/^(.+)(\.[a-z]+)$/, "$1_on$2"));
	}).mouseout(function(){
		$(this).attr("src",$(this).attr("src").replace(/^(.+)_on(\.[a-z]+)$/, "$1$2"));
	}).each(function(){
//		셀렉터에 태그 모양을 넣는다면 실행되지 않음. 미리 파일을 로딩을 해놓음
		$("<img>").attr("src",$(this).attr("src").replace(/^(.+)(\.[a-z]+)$/, "$1_on$2"));
	});
	return this;
}