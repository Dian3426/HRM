/**
 * Created by ML3426 on 2015/9/20 0020.
 */
$('#emp_birth').datepicker({
    format: "yyyy/mm/dd",
    weekStart: 7,
    todayBtn: "linked",
    language: "zh-CN",
    endDate: "today",
    autoclose: true,
    todayHighlight: true
});

$('#emp_grad').datepicker({
    format: "yyyy/mm",
    language: "zh-CN",
    endDate: "today",
    minViewMode: 1,
    autoclose: true
});

$('.input-daterange').datepicker({
    format: "yyyy-mm-dd",
    weekStart: 7,
    language: "zh-CN",
    autoclose: true,
    todayHighlight: true
});

$(".select2").select2();

$("#emp_faceimg_btn").click(function () {
    $("#emp_faceimg_input").trigger("click");
});

cities = {};

cities['北京市'] = ['北京市区', '北京市辖区'];
cities['上海市'] = ['上海市区', '上海市辖区'];
cities['天津市'] = ['天津市区', '天津市辖区'];
cities['重庆市'] = ['重庆市区', '重庆市辖区'];
cities['中国台湾'] = ['中国台湾'];
cities['中国香港'] = ['中国香港'];
cities['中国澳门'] = ['中国澳门'];
cities['河北省'] = ['石家庄', '张家口市', '承德市', '秦皇岛市', '唐山市', '廊坊市', '保定市', '沧州市', '衡水市', '邢台市', '邯郸市'];
cities['山西省'] = ['太原市', '大同市', '朔州市', '阳泉市', '长治市', '晋城市', '忻州地区', '吕梁地区', '晋中市', '临汾地区', '运城地区'];
cities['辽宁省'] = ['沈阳市', '朝阳市', '阜新市', '铁岭市', '抚顺市', '本溪市', '辽阳市', '鞍山市', '丹东市', '大连市', '营口市', '盘锦市', '锦州市', '葫芦岛市'];
cities['吉林省'] = ['长春市', '白城市', '松原市', '吉林市', '四平市', '辽源市', '通化市', '白山市', '延边朝鲜族自治州'];
cities['黑龙江省'] = ['哈尔滨市', '齐齐哈尔市', '牡丹江市', '佳木斯市', '大庆市', '鸡西市', '双鸭山市', '伊春市', '七台河市', '鹤岗市', '黑河市', '绥化市', '大兴安岭行署'];
cities['江苏省'] = ['南京市', '徐州市', '连云港', '宿迁市', '淮阴市', '盐城市', '扬州市', '泰州市', '南通市', '镇江市', '常州市', '无锡市', '苏州市'];
cities['浙江省'] = ['杭州市', '湖州市', '嘉兴市', '舟山市', '宁波市', '绍兴市', '金华市', '台州市', '温州市', '丽水地区'];
cities['安徽省'] = ['合肥市', '宿州市', '淮北市', '阜阳市', '蚌埠市', '淮南市', '滁州市', '马鞍山市', '芜湖市', '铜陵市', '安庆市', '黄山市', '六安市', '巢湖市', '池州地区', '宣城地区'];
cities['福建省'] = ['福州市', '南平市', '三明市', '莆田市', '泉州市', '厦门市', '漳州市', '龙岩市', '宁德市'];
cities['江西省'] = ['南昌市', '九江市', '景德镇市', '鹰潭市', '新余市', '萍乡市', '赣州市', '上饶地区', '抚州地区', '宜春地区', '吉安地区'];
cities['山东省'] = ['济南市', '聊城市', '德州市', '东营市', '淄博市', '潍坊市', '烟台市', '威海市', '青岛市', '日照市', '临沂市', '枣庄市', '济宁市', '泰安市', '莱芜市', '滨州地区', '菏泽地区'];
cities['河南省'] = ['郑州市', '三门峡市', '洛阳市', '焦作市', '新乡市', '鹤壁市', '安阳市', '濮阳市', '开封市', '商丘市', '许昌市', '漯河市', '平顶山市', '南阳市', '信阳市', '省直辖行政单位', '周口地区', '驻马店地区'];
cities['湖北省'] = ['武汉市', '十堰市', '襄攀市', '荆门市', '孝感市', '黄冈市', '鄂州市', '黄石市', '咸宁市', '荆州市', '宜昌市', '省直辖行政单位', '恩施土家族苗族自治州', '襄樊市'];
cities['湖南省'] = ['长沙市', '张家界市', '常德市', '益阳市', '岳阳市', '株洲市', '湘潭市', '衡阳市', '郴州市', '永州市', '邵阳市', '怀化市', '娄底市', '湘西土家族苗族自治州'];
cities['广东省'] = ['广州市', '清远市', '韶关市', '河源市', '梅州市', '潮州市', '汕头市', '揭阳市', '汕尾市', '惠州市', '东莞市', '深圳市', '珠海市', '江门市', '佛山市', '肇庆市', '云浮市', '阳江市', '茂名市', '湛江市'];
cities['海南省'] = ['海口市', '三亚市', '省直辖行'];
cities['四川省'] = ['成都市', '广元市', '绵阳市', '德阳市', '南充市', '广安市', '遂宁市', '内江市', '乐山市', '自贡市', '泸州市', '宜宾市', '攀枝花市', '巴中地区', '达川市', '资阳地区', '眉山地区', '雅安地区', '阿坝藏族羌族自治州', '甘孜藏族自治州', '凉山彝族自治州'];
cities['贵州省'] = ['贵阳市', '六盘水市', '遵义市', '毕节地区', '铜仁地区', '安顺地区', '黔东南苗族侗族自治地区', '黔南布依族苗族自治区', '黔西南布依族苗族自治州'];
cities['云南省'] = ['昆明市', '曲靖市', '玉溪市', '丽江地区', '昭通地区', '思茅地区', '临沧地区', '保山地区', '德宏傣族景颇族自治州', '怒江僳僳族自治州', '迪庆藏族自治州', '大理白族自治州', '楚雄彝族自治州', '红河哈尼族自治州', '文山壮族自治州', '西双版纳傣族自治州'];
cities['陕西省'] = ['西安市', '延安市', '铜川市', '渭南市', '咸阳市', '宝鸡市', '汉中市', '榆林市', '商洛地区', '安康地区'];
cities['甘肃省'] = ['兰州市', '嘉峪关市', '金昌市', '白银市', '天水市', '酒泉地区', '张掖地区', '武威地区', '庆阳地区', '平凉地区', '定西地区', '陇南地区', '临夏回族自治州', '甘南藏族自治州'];
cities['青海省'] = ['西宁市', '海东地区', '西宁市', '海北藏族', '海南藏族', '黄南藏族', '果洛藏族', '玉树藏族', '海西蒙古'];
cities['内蒙古自治区'] = ['呼和浩特', '包头市', '乌海市', '赤峰市', '呼伦贝尔盟', '兴安盟', '哲里木盟', '锡林郭勒盟', '乌兰察布盟', '伊克昭盟', '巴彦淖尔盟', '阿拉善盟'];
cities['广西壮族自治区'] = ['南宁市', '桂林市', '柳州市', '梧州市', '贵港市', '玉林市', '钦州市', '北海市', '防城港市', '南宁地区', '百色地区', '河池地区', '柳州地区', '贺州地区'];
cities['西藏自治区'] = ['拉萨市', '那曲地区', '昌都地区', '林芝地区', '山南地区', '日喀则', '阿里地区'];
cities['宁夏回族自治区'] = ['银川市', '石嘴山市', '吴忠市', '固原地区'];
cities['新疆维吾尔自治区'] = ['乌鲁木齐市', '克拉玛依市', '自治区直辖行政单位', '喀什地区', '阿克苏地区', '和田地区', '吐鲁番地区', '哈密地区', '克孜勒苏柯尔克孜', '博尔塔拉蒙古自治州', '昌吉回族自治州', '巴音郭楞蒙古自治州', '伊犁哈萨克自治州', '伊犁地区', '塔城地区', '阿勒泰地区'];


function set_city(province, city) {
    var pv, cv;
    var i, ii;

    pv = province.value;
    cv = city.value;
    city.length = 1;
    if (pv == '0') return;
    if (typeof(cities[pv]) == 'undefined') return;
    for (i = 0; i < cities[pv].length; i++) {
        ii = i + 1;
        city.options[ii] = new Option();
        city.options[ii].text = cities[pv][i];
        city.options[ii].value = cities[pv][i];
    }

}

window.URL = window.URL || window.webkitURL;
var fileElem = document.getElementById("emp_img_input"),
    fileList = document.getElementById("img_file");

function handleFiles(obj) {
    var files = obj.files,
        img = new Image();
    if (window.URL) {
        //File API
        $("#emp_faceimg_btn").attr("class", "btn btn-primary rhide");
        img.src = window.URL.createObjectURL(files[0]); //创建一个object URL，并不是你的本地路径
        img.width = 200;
        img.onload = function (e) {
            window.URL.revokeObjectURL(this.src); //图片加载后，释放object URL
        };
        fileList.appendChild(img);
    } else if (window.FileReader) {
        //opera不支持createObjectURL/revokeObjectURL方法。我们用FileReader对象来处理
        var reader = new FileReader();
        reader.readAsDataURL(files[0]);
        reader.onload = function (e) {
            $("#emp_faceimg_btn").attr("class", "btn btn-primary animated fadeOut");
            img.src = this.result;
            img.width = 200;
            fileList.appendChild(img);
        }
    } else {
        //ie
        obj.select();
        obj.blur();
        var nfile = document.selection.createRange().text;
        document.selection.empty();
        img.src = nfile;
        img.width = 200;
        img.onload = function () {
            $("#emp_faceimg_btn").attr("class", "btn btn-primary animated fadeOut");
        };
        fileList.appendChild(img);
        //fileList.style.filter="progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='image',src='"+nfile+"')";
    }
}

$.ajax({
    url: '/getPostAndSdept',
    type: 'POST',
    dataType: 'json',
    success: function (data) {
        for (var i = 0; i < data.length; i++) {
            $("#emp_position").append("<option value='" + data[i] + "'>" + data[i] + "</option>");
        }
    }
});

$("#emp_save").click(function () {
    $("#emp_info_table").ajaxSubmit({
        url: '/empInfoAdd',
        type: 'POST',
        dataType: 'json',
        success: function (data) {
            if (data['success'] == "1") {
                var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
                    '<h4 class="modal-title" id="myModalLabel">信息</h4>';
                var body = '添加成功';
                var footer = '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
                showModal(header, body, footer, {})
            } else {
                var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
                    '<h4 class="modal-title" id="myModalLabel">信息</h4>';
                var body = '添加失败';
                var footer = '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
                showModal(header, body, footer, {})
            }
            $("#emp_info_table")[0].reset();
        }
    });
});
