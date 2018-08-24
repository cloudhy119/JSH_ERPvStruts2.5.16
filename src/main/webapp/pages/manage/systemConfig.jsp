<%@page import="com.jsh.util.Tools" %>
<%@ page language="java" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String clientIp = Tools.getLocalIp(request);
%>
<!DOCTYPE html>
<html>
<head>
    <title>系统配置</title>
    <meta charset="utf-8">
    <!-- 指定以IE8的方式来渲染 -->
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8"/>
    <link rel="shortcut icon" href="<%=path%>/images/favicon.ico" type="image/x-icon"/>
    <script type="text/javascript" src="<%=path %>/js/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="<%=path %>/js/colorbox/jquery.colorbox-min.js"></script>
    <script type="text/javascript" src="<%=path %>/js/colorbox/colorboxSet.js"></script>
    <link href="<%=path %>/js/colorbox/colorbox.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="<%=path %>/js/easyui-1.3.5/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="<%=path %>/js/easyui-1.3.5/themes/icon.css"/>
    <link type="text/css" rel="stylesheet" href="<%=path %>/css/common.css"/>
    <script type="text/javascript" src="<%=path %>/js/easyui-1.3.5/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="<%=path %>/js/easyui-1.3.5/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="<%=path %>/js/common/common.js"></script>
    <script>
        $(function () {
            //加载信息
            function loadInfo() {
                $.ajax({
                    type: "get",
                    url: "<%=path %>/systemConfig/findBy.action",
                    dataType: "json",
                    success: function (res) {
                        if (res && res.rows) {
                            var array = res.rows;
                            for (var i = 0; i < array.length; i++) {
                                var name = array[i].name;
                                $("." + name).val(array[i].value).attr("data-value", array[i].value).attr("data-id", array[i].id);
                            }
                        }
                    },
                    //此处添加错误处理
                    error: function () {
                        $.messager.alert('查询失败', '查询系统配置信息异常，请稍后再试！', 'error');
                        return;
                    }
                });
            }

            loadInfo(); //加载信息

            $("#saveSystemConfig").off("click").on("click", function () {
                var status = false;
                $("#searchTable input").each(function () {
                    var thisId = $(this).attr("data-id");
                    var thisValue = $(this).attr("data-value");
                    if ($(this).val() != thisValue) {
                        //更新修改过的单行信息
                        $.ajax({
                            type: "post",
                            url: "<%=path %>/systemConfig/update.action",
                            dataType: "json",
                            data: {
                                id: thisId,
                                value: $(this).val()
                            },
                            success: function (res) {
                                if (res) {
                                    status = true;
                                }
                            },
                            //此处添加错误处理
                            error: function () {
                                $.messager.alert('保存失败', '保存系统配置信息失败，请稍后再试！', 'error');
                                return;
                            }
                        });
                    }
                });
                setTimeout(function () {
                    if (status) {
                        $.messager.alert('保存成功', '保存系统配置信息成功！', 'info');
                        loadInfo(); //加载信息
                    }
                    else {
                        $.messager.alert('提示', '信息未修改，无需保存！', 'info');
                    }
                }, 1000);
            });
        })
    </script>
</head>
<body>
<div class="system-config">
    <table id="searchTable">
        <tr>
            <td>公司名称：</td>
            <td>
                <input type="text" class="company_name easyui-validatebox"
                       data-options="required:true,validType:'length[2,30]'" style="width:250px;"/>
            </td>
        </tr>
        <tr>
            <td>联系人：</td>
            <td>
                <input type="text" class="company_contacts" style="width:250px;"/>
            </td>
        </tr>
        <tr>
            <td>公司地址：</td>
            <td>
                <input type="text" class="company_address" style="width:250px;"/>
            </td>
        </tr>
        <tr>
            <td>公司电话：</td>
            <td>
                <input type="text" class="company_tel" style="width:250px;"/>
            </td>
        </tr>
        <tr>
            <td>公司传真：</td>
            <td>
                <input type="text" class="company_fax" style="width:250px;"/>
            </td>
        </tr>
        <tr>
            <td>公司邮编：</td>
            <td>
                <input type="text" class="company_post_code" style="width:250px;"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <a href="javascript:void(0)" id="saveSystemConfig" class="easyui-linkbutton" iconCls="icon-ok">保存信息</a>
            </td>
        </tr>
    </table>
</div>
</body>
</html>