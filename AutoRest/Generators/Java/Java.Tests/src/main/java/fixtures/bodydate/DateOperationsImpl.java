/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydate;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import retrofit.Retrofit;
import retrofit.Call;
import retrofit.Response;
import org.joda.time.LocalDate;
import fixtures.bodydate.models.Error;

public class DateOperationsImpl implements DateOperations {
    private DateService service;
    AutoRestDateTestService client;

    public DateOperationsImpl(Retrofit retrofit, AutoRestDateTestService client) {
        this.service = retrofit.create(DateService.class);
        this.client = client;
    }

    /**
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public LocalDate getNull() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getNull();
            ServiceResponse<LocalDate> response = getNullDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getNullAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getNullDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<LocalDate> getNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<LocalDate>()
                .register(200, new TypeToken<LocalDate>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public LocalDate getInvalidDate() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getInvalidDate();
            ServiceResponse<LocalDate> response = getInvalidDateDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getInvalidDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getInvalidDate();
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getInvalidDateDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<LocalDate> getInvalidDateDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<LocalDate>()
                .register(200, new TypeToken<LocalDate>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public LocalDate getOverflowDate() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getOverflowDate();
            ServiceResponse<LocalDate> response = getOverflowDateDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getOverflowDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getOverflowDate();
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getOverflowDateDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<LocalDate> getOverflowDateDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<LocalDate>()
                .register(200, new TypeToken<LocalDate>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public LocalDate getUnderflowDate() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getUnderflowDate();
            ServiceResponse<LocalDate> response = getUnderflowDateDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getUnderflowDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getUnderflowDate();
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getUnderflowDateDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<LocalDate> getUnderflowDateDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<LocalDate>()
                .register(200, new TypeToken<LocalDate>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     *
     * @param dateBody the LocalDate value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putMaxDate(LocalDate dateBody) throws ServiceException {
        if (dateBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter dateBody is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.putMaxDate(dateBody);
            ServiceResponse<Void> response = putMaxDateDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putMaxDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback) {
        if (dateBody == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter dateBody is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.putMaxDate(dateBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putMaxDateDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putMaxDateDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public LocalDate getMaxDate() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getMaxDate();
            ServiceResponse<LocalDate> response = getMaxDateDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMaxDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getMaxDate();
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMaxDateDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<LocalDate> getMaxDateDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<LocalDate>()
                .register(200, new TypeToken<LocalDate>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     *
     * @param dateBody the LocalDate value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putMinDate(LocalDate dateBody) throws ServiceException {
        if (dateBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter dateBody is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.putMinDate(dateBody);
            ServiceResponse<Void> response = putMinDateDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putMinDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback) {
        if (dateBody == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter dateBody is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.putMinDate(dateBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putMinDateDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putMinDateDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     *
     * @return the LocalDate object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public LocalDate getMinDate() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getMinDate();
            ServiceResponse<LocalDate> response = getMinDateDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMinDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        Call<ResponseBody> call = service.getMinDate();
        call.enqueue(new ServiceResponseCallback<LocalDate>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMinDateDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<LocalDate> getMinDateDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<LocalDate>()
                .register(200, new TypeToken<LocalDate>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
