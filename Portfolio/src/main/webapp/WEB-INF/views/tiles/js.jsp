<!-- Bootstrap core JavaScript-->
<script src="${pageContext.request.contextPath}/resources/bootstrap/vendor/jquery/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/bootstrap/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script
	src="${pageContext.request.contextPath}/resources/bootstrap/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="${pageContext.request.contextPath}/resources/bootstrap/js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="${pageContext.request.contextPath}/resources/bootstrap/vendor/chart.js/Chart.min.js"></script>

<!-- Page level custom scripts -->
<script src="${pageContext.request.contextPath}/resources/bootstrap/js/demo/chart-area-demo.js"></script>
<script src="${pageContext.request.contextPath}/resources/bootstrap/js/demo/chart-pie-demo.js"></script>

<script>
	$(function(){
		//perPageNum select 박스 설정
		setPerPageNumSelect();
		
		//prev 버튼 활성화, 비활성화 처리
		var canPrev = '${pageMaker.prev}';
		if(canPrev !== 'true'){
			$('#page-prev').addClass('disabled');
		}
		
		//next 버튼 활성화, 비활성화 처리
		var canNext = '${pageMaker.next}';
		if(canNext !== 'true'){
			$('#page-next').addClass('disabled');
		}
		
		//현재 페이지 파란색으로 활성화
		var thisPage = '${pageMaker.cri.page}';
		//매번 refresh 되므로 다른 페이지 removeClass 할 필요는 없음->Ajax 이용시엔 해야함
		$('#page'+thisPage).addClass('active');
	})
	
	function setPerPageNumSelect(){
		var perPageNum = "${pageMaker.cri.perPageNum}";
		var $perPageSel = $('#perPageSel');
		var thisPage = '${pageMaker.cri.page}';
		
		$perPageSel.val(perPageNum).prop("selected",true);
		//PerPageNum가 바뀌면 링크 이동
		$perPageSel.on('change',function(){
			//pageMarker.makeQuery 사용 못하는 이유: makeQuery는 page만을 매개변수로 받기에 변경된 perPageNum을 반영못함
			window.location.href = "wallet?page="+thisPage+"&perPageNum="+$perPageSel.val();
		})
	}
</script>