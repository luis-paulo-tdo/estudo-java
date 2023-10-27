package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Program {

public static Scanner scanner;
	
	public static void main(String[] args) throws ParseException {
		
		instanciarDataHora();
		converterDataHoraParaTexto();
		converterDataHoraGlobalParaLocal();
		calcularDataHora();
		manipularDate();
		manipularCalendar();
	}
	
	private static void manipularCalendar() {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		Date dateSimple = Date.from(Instant.parse("2023-10-26T17:35:24Z"));
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateSimple);
		calendar.add(Calendar.HOUR_OF_DAY, 4);
		Date dateCalendar = calendar.getTime();
		int minutes = calendar.get(Calendar.MINUTE);
		int month = 1 + calendar.get(Calendar.MONTH);
		
		System.out.println("Trabalhando com Calendar");
		System.out.println("Data Simple:\t\t" + simpleDateFormat.format(dateSimple));
		System.out.println("Data Calendar:\t\t" + simpleDateFormat.format(dateCalendar));
		System.out.println("Data Calendar Minutes:\t" + minutes);
		System.out.println("Data Calendar Month:\t" + month);
		System.out.println();
	}
	
	private static void manipularDate() throws ParseException {
		
		SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdfGmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdfGmt.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date dateAtual = new Date();
		Date dateAtualMilissegundos = new Date(System.currentTimeMillis());
		Date dateInicial = new Date(0L);
		Date dateInicialAposCincoHoras = new Date(1000 * 60 * 60 * 5);
		Date dateData = sdfData.parse("25/06/2018");
		Date dateDataHora = sdfDataHora.parse("25/06/2018 15:42:07");
		Date dateISO8601 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("Trabalhando com Date");
		System.out.println("Data atual com SimpleDateFormat:\t\t\t" + sdfDataHora.format(dateAtual));
		System.out.println("Data atual em milissegundos com SimpleDateFormat:\t" + sdfDataHora.format(dateAtualMilissegundos));
		System.out.println("Data inicial com SimpleDateFormat:\t\t\t" + sdfDataHora.format(dateInicial));
		System.out.println("Data inicial após cinco horas com SimpleDateFormat:\t" + sdfDataHora.format(dateInicialAposCincoHoras));
		System.out.println("Data \"dd/MM/yyyy\" com SimpleDateFormat:\t\t\t" + sdfData.format(dateData));
		System.out.println("Data \"dd/MM/yyyy HH:mm:ss\" com SimpleDateFormat:\t" + sdfDataHora.format(dateDataHora));
		System.out.println("Data ISO8601 com SimpleDateFormat:\t\t\t" + sdfDataHora.format(dateISO8601));
		System.out.println();
		
		System.out.println("Trabalhando com Date em UTC");
		System.out.println("Data atual com SimpleDateFormat:\t\t\t" + sdfGmt.format(dateAtual));
		System.out.println("Data atual em milissegundos com SimpleDateFormat:\t" + sdfGmt.format(dateAtualMilissegundos));
		System.out.println("Data inicial com SimpleDateFormat:\t\t\t" + sdfGmt.format(dateInicial));
		System.out.println("Data inicial após cinco horas com SimpleDateFormat:\t" + sdfGmt.format(dateInicialAposCincoHoras));
		System.out.println("Data \"dd/MM/yyyy\" com SimpleDateFormat:\t\t\t" + sdfGmt.format(dateData));
		System.out.println("Data \"dd/MM/yyyy HH:mm:ss\" com SimpleDateFormat:\t" + sdfGmt.format(dateDataHora));
		System.out.println("Data ISO8601 com SimpleDateFormat:\t\t\t" + sdfGmt.format(dateISO8601));
		System.out.println();
		
		System.out.println("Trabalhando com Date sem SimpleDateFormat");
		System.out.println("Data atual com SimpleDateFormat:\t\t\t" + dateAtual);
		System.out.println("Data atual em milissegundos com SimpleDateFormat:\t" + dateAtualMilissegundos);
		System.out.println("Data inicial com SimpleDateFormat:\t\t\t" + dateInicial);
		System.out.println("Data inicial após cinco horas com SimpleDateFormat:\t" + dateInicialAposCincoHoras);
		System.out.println("Data \"dd/MM/yyyy\" com SimpleDateFormat:\t\t\t" + dateData);
		System.out.println("Data \"dd/MM/yyyy HH:mm:ss\" com SimpleDateFormat:\t" + dateDataHora);
		System.out.println("Data ISO8601 com SimpleDateFormat:\t\t\t" + dateISO8601);
		System.out.println();
	}
	
	private static void calcularDataHora() {
		
		LocalDate dataLocal = LocalDate.parse("2022-07-20");
		LocalDateTime dataHoraLocal = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant dataHoraGlobal = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate dataSemanaPassada = dataLocal.minusDays(7);
		LocalDate dataProximaSemana = dataLocal.plusDays(7);
		LocalDate dataAposSeteAnos = dataLocal.plusYears(7);
		
		LocalDateTime dataHoraSemanaPassada = dataHoraLocal.minusDays(7);
		LocalDateTime dataHoraProximaSemana = dataHoraLocal.plusDays(7);
		LocalDateTime dataHoraAposSeteAnos = dataHoraLocal.plusYears(7);
		
		Instant dataHoraGlobalSemanaPassada = dataHoraGlobal.minus(7, ChronoUnit.DAYS);
		Instant dataHoraGlobalProximaSemana = dataHoraGlobal.plus(7,  ChronoUnit.DAYS);
		Instant dataHoraGlobalAposSeteAnos = dataHoraGlobal.plus(7 * 365, ChronoUnit.DAYS);
		
		Duration duracaoDataSeteDias = Duration.between(dataSemanaPassada.atStartOfDay(), dataLocal.atStartOfDay());
		Duration duracaoDataHoraSeteDias = Duration.between(dataHoraSemanaPassada, dataHoraLocal);
		Duration duracaoDataHoraGlobalSeteDias = Duration.between(dataHoraGlobal, dataHoraGlobalProximaSemana);
		
		System.out.println("Cálculo de Data");
		System.out.println("Semana anterior a " + dataLocal + ":\t\t\t" + dataSemanaPassada);
		System.out.println("Semana posterior a " + dataLocal + ":\t\t\t" + dataProximaSemana);
		System.out.println("Sete anos após " + dataLocal + ":\t\t\t" + dataAposSeteAnos);
		System.out.println();
		
		System.out.println("Cálculo de Data-Hora");
		System.out.println("Semana anterior a " + dataHoraLocal + ":\t\t" + dataHoraSemanaPassada);
		System.out.println("Semana posterior a " + dataHoraLocal + ":\t\t" + dataHoraProximaSemana);
		System.out.println("Sete anos após " + dataHoraLocal + ":\t\t" + dataHoraAposSeteAnos);
		System.out.println();
		
		System.out.println("Cálculo de Data-Hora Global");
		System.out.println("Semana anterior a " + dataHoraGlobal + ":\t\t" + dataHoraGlobalSemanaPassada);
		System.out.println("Semana posterior a " + dataHoraGlobal + ":\t" + dataHoraGlobalProximaSemana);
		System.out.println("Sete anos após " + dataHoraGlobal + ":\t\t" + dataHoraGlobalAposSeteAnos);
		System.out.println();
		
		System.out.println("Cálculo de Durações");
		System.out.println("Duração entre " + dataSemanaPassada + " e " + dataLocal + " é de:\t\t\t" + duracaoDataSeteDias.toDays() + " Dias");
		System.out.println("Duração entre " + dataHoraSemanaPassada + " e " + dataHoraLocal + " é de:\t" + duracaoDataHoraSeteDias.toDays() + " Dias");
		System.out.println("Duração entre " + dataHoraGlobalProximaSemana + " e " + dataHoraGlobal + " é de:\t" + duracaoDataHoraGlobalSeteDias.toDays() + " Dias");
		System.out.println();
	}
	
	private static void converterDataHoraGlobalParaLocal() {
		
		LocalDate dataLocalConversao = LocalDate.parse("2022-07-20");
		LocalDateTime dataHoraLocalConversao = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant dataHoraGlobalConversao = Instant.parse("2022-07-20T01:30:26Z");
		
		System.out.println("\tImpressão de Datas-Horas convertidas para Texto");
		for (String zoneId : ZoneId.getAvailableZoneIds()) {
			System.out.println("\t\t" + zoneId);
		}
		System.out.println();
		
		System.out.println("Impressão de Datas-Horas Globais convertidas para Locais");
		System.out.println("Data-Hora Global a se converter:\t" + dataHoraGlobalConversao);
		LocalDate dataConvertida = LocalDate.ofInstant(dataHoraGlobalConversao, ZoneId.systemDefault());
		LocalDate dataPortugalConvertida = LocalDate.ofInstant(dataHoraGlobalConversao, ZoneId.of("Portugal"));
		LocalDateTime dataHoraConvertida = LocalDateTime.ofInstant(dataHoraGlobalConversao, ZoneId.systemDefault());
		LocalDateTime dataHoraPortugalConvertida = LocalDateTime.ofInstant(dataHoraGlobalConversao, ZoneId.of("Portugal"));
		System.out.println("Data Local Convertida:\t\t\t" + dataConvertida);
		System.out.println("Data Local de Portugal Convertida:\t" + dataPortugalConvertida);
		System.out.println("Data-Hora Local Convertida:\t\t" + dataHoraConvertida);
		System.out.println("Data-Hora Local de Portugal Convertida:\t" + dataHoraPortugalConvertida);
		System.out.println();
		
		System.out.println("Obtendo dados da Data:\t" + dataLocalConversao);
		System.out.println("Dia do Mês:\t\t" + dataLocalConversao.getDayOfMonth());
		System.out.println("Mês:\t\t\t" + dataLocalConversao.getMonthValue());
		System.out.println("Ano:\t\t\t" + dataLocalConversao.getYear());
		System.out.println();
		
		System.out.println("Obtendo dados da Data-Hora:\t" + dataHoraLocalConversao);
		System.out.println("Hora:\t\t\t\t" + dataHoraLocalConversao.getHour());
		System.out.println("Minuto:\t\t\t\t" + dataHoraLocalConversao.getMinute());
		
		System.out.println();
	}
	
	private static void converterDataHoraParaTexto() {
		
		LocalDate dataLocalConversao = LocalDate.parse("2022-07-20");
		LocalDateTime dataHoraLocalConversao = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant dataHoraGlobalConversao = Instant.parse("2022-07-20T01:30:26Z");
		
		System.out.println("Impressão de Datas-Horas convertidas para Texto");
		System.out.println("Data Local:\t\t\t\t" + dataLocalConversao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Data-Hora Local:\t\t\t" + dataHoraLocalConversao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		System.out.println("Data-Hora Local (ISO_DATE_TIME):\t" + dataHoraLocalConversao.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println("Data-Hora Global:\t\t\t" + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()).format(dataHoraGlobalConversao));
		System.out.println("Data-Hora Global (ISO_INSTANT):\t\t" + DateTimeFormatter.ISO_INSTANT.format(dataHoraGlobalConversao));
		System.out.println("Data-Hora Global toString():\t\t" + dataHoraGlobalConversao.toString());
		System.out.println();
	}
	
	private static void instanciarDataHora() throws ParseException {
		
		LocalDate dataLocalInstancia = LocalDate.now();
		LocalDateTime dataHoraLocalInstancia = LocalDateTime.now();
		Instant dataHoraGlobalInstancia = Instant.now();
		
		LocalDate dataLocalISO8601Instancia = LocalDate.parse("2022-07-20");
		LocalDateTime dataHoraLocalISO8601Instancia = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant dataHoraGlobalGInstancia = Instant.parse("2022-07-20T01:30:26Z");
		Instant dataHoraGlobalGMTMenos3Instancia = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")).parse("2022-07-20T01:30:26-03:00").toInstant();
		
		LocalDate dataLocalFormatada = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime dataHoraLocalFormatada = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate dataLocalAnoMesDia = LocalDate.of(2022, 7, 20);
		LocalDateTime dataHoraLocalAnoMesDia = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		System.out.println("Impressão de Instâncias de Datas");
		System.out.println("Data Local:\t\t\t\t\t" + dataLocalInstancia);
		System.out.println("Data-Hora Local:\t\t\t\t" + dataHoraLocalInstancia);
		System.out.println("Data-Hora Global:\t\t\t\t" + dataHoraGlobalInstancia);
		System.out.println("Data Local ISO8601:\t\t\t\t" + dataLocalISO8601Instancia);
		System.out.println("Data-Hora Local ISO8601:\t\t\t" + dataHoraLocalISO8601Instancia);
		System.out.println("Data-Hora Global ISO8601:\t\t\t" + dataHoraGlobalGInstancia);
		System.out.println("Data-Hora Global GMT-3:\t\t\t\t" + dataHoraGlobalGMTMenos3Instancia);
		System.out.println("Data Local Formatada:\t\t\t\t" + dataLocalFormatada);
		System.out.println("Data-Hora Local Formatada:\t\t\t" + dataHoraLocalFormatada);
		System.out.println("Data Local Ano-Mês-Dia:\t\t\t\t" + dataLocalAnoMesDia);
		System.out.println("Data-Hora Local Ano-Mês-Dia-Hora-Minuto:\t" + dataHoraLocalAnoMesDia);
		System.out.println();
	}
}
