(function ($) {
    'use strict';
    /*==================================================================
        [ Daterangepicker ]*/
    try {
        $('.js-datepicker').daterangepicker({
            "singleDatePicker": true,
            "showDropdowns": true,
            "autoUpdateInput": false,
            locale: {
                format: 'DD/MM/YYYY'
            },
        });
    
        var myCalendar = $('.js-datepicker');
        var isClick = 0;
    
        $(window).on('click',function(){
            isClick = 0;
        });
    
        $(myCalendar).on('apply.daterangepicker',function(ev, picker){
            isClick = 0;
            $(this).val(picker.startDate.format('DD/MM/YYYY'));
    
        });
    
        $('.js-btn-calendar').on('click',function(e){
            e.stopPropagation();
    
            if(isClick === 1) isClick = 0;
            else if(isClick === 0) isClick = 1;
    
            if (isClick === 1) {
                myCalendar.focus();
            }
        });
    
        $(myCalendar).on('click',function(e){
            e.stopPropagation();
            isClick = 1;
        });
    
        $('.daterangepicker').on('click',function(e){
            e.stopPropagation();
        });
    
    
    } catch(er) {console.log(er);}
    /*[ Select 2 Config ]
        ===========================================================*/
    
    try {
        var selectSimple = $('.js-select-simple');
    
        selectSimple.each(function () {
            var that = $(this);
            var selectBox = that.find('select');
            var selectDropdown = that.find('.select-dropdown');
            selectBox.select2({
                dropdownParent: selectDropdown
            });
        });
    
    } catch (err) {
        console.log(err);
    }
    

})(jQuery);

/**
 * Mascara do campo - CPF/CNPJ, altera dinamicamente
 * @param campo     - Campos do FormulÃ¡rio
 * @param teclapres - Tecla pressionada
 * @returns {Boolean}
 */
function MascaraCpfCnpj(campo,teclapres) {
    var tecla = teclapres.keyCode;

    if ((tecla < 48 || tecla > 57) && (tecla < 96 || tecla > 105) && tecla != 46 && tecla != 8 && tecla != 9) {
        return false;
    }

    var vr = campo.value;
    vr = vr.replace( /\//g, "" );
    vr = vr.replace( /-/g, "" );
    vr = vr.replace( /\./g, "" );
    var tam = vr.length;

    if ( tam <= 2 ) {
        campo.value = vr;
    }
    if ( (tam > 2) && (tam <= 5) ) {
        campo.value = vr.substr( 0, tam - 2 ) + '-' + vr.substr( tam - 2, tam );
    }
    if ( (tam >= 6) && (tam <= 8) ) {
        campo.value = vr.substr( 0, tam - 5 ) + '.' + vr.substr( tam - 5, 3 ) + '-' + vr.substr( tam - 2, tam );
    }
    if ( (tam >= 9) && (tam <= 11) ) {
        campo.value = vr.substr( 0, tam - 8 ) + '.' + vr.substr( tam - 8, 3 ) + '.' + vr.substr( tam - 5, 3 ) + '-' + vr.substr( tam - 2, tam );
    }
    if ( (tam == 12) ) {
        campo.value = vr.substr( tam - 12, 3 ) + '.' + vr.substr( tam - 9, 3 ) + '/' + vr.substr( tam - 6, 4 ) + '-' + vr.substr( tam - 2, tam );
    }
    if ( (tam > 12) && (tam <= 14) ) {
        campo.value = vr.substr( 0, tam - 12 ) + '.' + vr.substr( tam - 12, 3 ) + '.' + vr.substr( tam - 9, 3 ) + '/' + vr.substr( tam - 6, 4 ) + '-' + vr.substr( tam - 2, tam );
    }
    if (tam > 13){     
        if (tecla != 8){
            return false
        }
    }
    
}