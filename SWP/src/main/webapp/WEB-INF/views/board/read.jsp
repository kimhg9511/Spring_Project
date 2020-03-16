<!-- read.jsp -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@include file="../include/header.jsp"%>

<div id="saveOK" class="alert alert-warning hidden" role="alert">글이
	수정되었습니다.</div>

<div class="box-body">
	<span><b>글번호:</b> ${boardVO.bno}</span>

	<div class="form-group">
		<label for="title">Title</label> <input type="text" id="title"
			name="title" class="form-control" value="${boardVO.title}"
			readonly="readonly" />
	</div>

	<div class="form-group">
		<label for="content">Content</label>
		<textarea name="content" id="content" class="form-control" rows="3"
			readonly="readonly">${boardVO.content}</textarea>
	</div>

	<div class="form-group">
		<label for="writer">Writer</label> <input type="text" id="writer"
			name="writer" class="form-control" value="${boardVO.writer}"
			readonly="readonly" />
	</div>

</div>

<div>
	<!-- 목록 버튼 -->
	<a href="/board/listPage${cri.makeQuery()}" class="btn btn-primary">List Page</a>
	<!-- 수정 버튼 -->
	<a href="/board/update${cri.makeQuery()}&bno=${boardVO.bno}"
		class="btn btn-warning">update</a>
	<!-- 삭제 버튼 -->
	<button id="btn-remove" class="btn btn-danger">delete</button>
</div>
<script>
	//삭제 버튼 누르면 삭제할 것이냐고 묻고 삭제한다고 하면 주소이동(BoardController의 remove 메소드 호출)
	var result = '${result}';
	$(function() {
		$('#btn-remove').click(function() {
			if (confirm("are you sure?")) {
				self.location.href = "/board/remove${cri.makeQuery()}&bno=${boardVO.bno}";
			}
		});

		//수정 성공시 문구 나타났다 사라짐
		if (result === 'saveOK') {
			$('#saveOK').removeClass('hidden');
			$('#saveOK').fadeOut(2000);
		}
	});
</script>


<%@include file="../include/footer.jsp"%>