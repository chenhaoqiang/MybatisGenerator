package org.mybatis.generator;

public class Test {
	public static void main(String[] args) {
		test(new String[] { "CW_Invoice", "CW_WasteInvoice", "CW_OPTInVoice", "CW_StuPayBooks", "IA_User", "IA_UserAppAcc", "PM_ClassFee",
		        "PM_StuClassPay", "PX_APPLY", "PX_Attach", "PX_CLASS", "PX_ClassGrp", "PX_ClassType", "PX_IniteCode", "PX_PayItem", "PX_SPECIALTY",
		        "PX_STUDENT", "PX_StudentContact", "PX_TEACHER", "PX_TeacherClass", "PX_TeacherContact", "PX_discount", "PX_stuAttach" });
	}

	private static void test(String[] tableNames) {
		for (String tn : tableNames) {
			StringBuilder sb = new StringBuilder();
			sb.append("<table tableName=\"");
			sb.append(tn);
			sb.append("\" enableCountByExample=\"false\" enableUpdateByExample=\"false\" enableDeleteByExample=\"false\" enableSelectByExample=\"false\" selectByExampleQueryId=\"false\" />");
			System.out.println(sb.toString());
		}
	}
}
