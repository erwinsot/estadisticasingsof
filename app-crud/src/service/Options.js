let Options = function() {
    this.pie= {
        chart: {
            type: 'pie',
            plotBackgroundColor: null,
            plotBorderWidth: null,
            plotShadow: false
        },
        title: {
            text: ''
        },
        tooltip: {
            headerFormat: '{series.name}<br>',
            pointFormat: '{point.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                dataLabels: {
                    enabled: true,
                },
                showInLegend: true,
                events: {
                    click: function(e) {
                    }
                }
            },
        },
        series: [{
            name: '',
            colorByPoint: true,
            // Recibir datos dinámicamente
            data: []
        }]
    }
};
// Este método se llamará en la página
Options.prototype.funcc = function (op) {
    if(op.pie != null){
        // Copiar objeto
        this.pie = Object.assign(this.pie, op.pie)
    }
}

export default new Options();
