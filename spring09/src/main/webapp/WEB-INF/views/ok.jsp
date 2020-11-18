<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<tr style="background: lime;">
					<td style="width: 50px;">${status.index+1}</td>
					<td style="width: 300px;">${vo.content}</td>
					<td style="width: 100px;">${vo.writer}</td>
					<td style="width: 100px;">
						<!-- one.do?no=1  --> 
						<a href="delete3.do?no=${vo.no}&original=${vo.original}">
							<button style="background: yellow;">ªË¡¶</button>
					</a>
					</td>
				</tr>